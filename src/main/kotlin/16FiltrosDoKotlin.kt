//import java.util.*
// -- 16. Filtros do Kotlin
//fun main(args: Array<String>) {
//  //  println("Hello, ${args[0]}!")
//  //  feedTheFish()
//  // filtros são eager e lazy
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
//  shouldChangeWater(day, 20, 50)
//  shouldChangeWater(day)
//  shouldChangeWater(day, dirty = 50)
//  if (shouldChangeWater(day)) {
//    println("Change the water today")
//  }
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
// -- 17. Quiz: Hora de praticarmos
//fun main(args: Array<String>) {
//  val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
//  println(spices.filter { it.contains("curry")})
//  val start = 'c'
//  val end = 'e'
//  val filterStartEnd = spices.filter { it.startsWith(start) && it.endsWith(end) }
//  filterStartEnd.forEach(::println)
//  val threeElements = spices.take(3).filter { it.startsWith(start)}
//  println(threeElements)
//}