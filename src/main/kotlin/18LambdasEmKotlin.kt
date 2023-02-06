import java.util.*

// -- 18. Lambdas em Kotlin
//fun main(args: Array<String>) {
//  eagerExample()
//}
//
//fun eagerExample() {
//  val decorations = listOf(
//    "rock", "pagoda",
//    "plastic plant", "alligator", "flowerpot"
//  )
//  // eager terá uma nova lista, contendo as decorações que começam com P.
//  val eager = decorations.filter { it[0] == 'p' }
//  println(eager)
//
//  // apply filter lazily
//  val filtered = decorations.asSequence().filter { it[0] == 'p' }
//  println(filtered)
//  println(filtered.toList())
//
//  // apply map lazily
//  val lazyMap = decorations.asSequence().map {
//    println("map: $it")
//    it
//  }
//  println(lazyMap)
//  println("first: ${lazyMap.first()}")
//  println("all: ${lazyMap.toList()}")
//}
//
//fun feedTheFish() {
//  val day = randomDay()
//  val food = fishFood(day)
//  println("Today is $day and the fish eat $food")
//
//  if (shouldChangeWater(day)) {
//    println("Change the water today")
//  }
//  // call dirty processor
//  dirtyProcessor()
//}
//
//fun shouldChangeWater(
//  day: String,
//  temperature: Int = 32,
//  dirty: Int = 20
//): Boolean {
//  return when {
//    isTooHot(temperature) -> true
//    isDirty(dirty) -> true
//    isSunday(day) -> true
//    else -> false
//  }
//}
//
//var dirty = 20
//val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
//// peixes sujam o aquário quando comem, feedFish deixa o tanque mais sujo
//// feedFish: função nomeada e não um lambda
//fun feedFish(dirty: Int) = dirty + 10
//
//fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
//  return operation(dirty)
//}
//
//// gerenciamento processar a sujeira
//fun dirtyProcessor() {
//  dirty = updateDirty(dirty, waterFilter)
//  // feedFish como sendo função nomeada, usaremos dois pontos duplos para passá-la
//  // dessa forma, o Kotlin sabe que não chamamos feedFish
//  // e permitirá passar uma referência.
//  dirty = updateDirty(dirty, ::feedFish)
//  // ao combinar funções de ordem superior com lambdas
//  // o Kotlin apresentará a sintaxe especial
//  // passamos o lambda como argumento
//  // chamar updateDirty novamente, passando o lambda como argumento
//  // obs: lambda é um argumento do updateDirty, mas como passamos como último
//  // parâmetro, não precisa por nos parênteses da função
//  dirty = updateDirty(dirty) { dirty ->
//    dirty + 50
//  }
//}
//
//fun isTooHot(temperature: Int) = temperature > 30
//fun isDirty(dirty: Int) = dirty > 30
//fun isSunday(day: String) = day == "Sunday"
//
//fun randomDay(): String {
//  val week = listOf("Monday", "Tuesday", "Wednesday", "Friday", "Saturday", "Sunday")
//  return week[Random().nextInt(7)]
//}
//
//fun fishFood(day: String): String {
//  var food = "fasting"
//  return when (day) {
//    "Monday" -> "flakes"
//    "Wednesday" -> "redworms"
//    "Thursday" -> "granules"
//    "Friday" -> "mosquitoes"
//    "Saturday" -> "lettuce"
//    "Sunday" -> "plankton"
//    else -> "fasting"
//  }
//}
// -- 19. Quiz
fun main(args: Array<String>) {
  gamePlay(12)
}
fun gamePlay(game: Int) {
  val rollDice = { aux: Int ->
    if (aux == 0) 0 else Random().nextInt(aux) + 1
  }
  println(rollDice(game))
  val rollDice2: (Int) -> Int = { aux: Int ->
    if (aux == 0) 0 else Random().nextInt(aux) + 1
  }
  println(rollDice2(game))
}
// -- Perguntas extras
// -- 1. Por que você quer usar a notação de tipo de função em vez de usar apenas o lambda?
// Melhor legibilidade do código, Verificação de tipos mais rigorosa, Maior flexibilidade na escrita do código