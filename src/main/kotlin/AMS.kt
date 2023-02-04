import java.util.Calendar
import java.util.Random

//fun dayOfWeek() {
//    println(Calendar.getInstance().get(Calendar.DAY_OF_WEEK))
//}
//fun main(args: Array<String>) {
//    println("Hello, world!")
//    dayOfWeek()
//}
//fun main(args: Array<String>) {
//  if (args[0].toInt() in 0..11) println("Good morning, Kotlin") else println("Good night, Kotlin")
//}
//////////
// -- 6. Dia aleatório
//fun main(args: Array<String>) {
//  println("Hello, ${args[0]}!")
//  feedTheFish()
//}
//fun feedTheFish() {
//  val day = randomDay()
//  val food = "pallets"
//  println("Today is $day and the fish eat $food")
//}
//fun randomDay() : String {
//  val week = listOf("Monday", "Tuesday", "Wednesday", "Friday", "Saturday", "Sunday")
//  return week[Random().nextInt(7)]
//}
// -- 7. Quiz: Hora de praticarmos
//fun main(args: Array<String>) {
//  var count = 0
//  do {
//    val response = getFortuneCookie()
//    println("Your fortune is: $response")
//    if ("Take it easy" === response) count = 10
//    count += 1
//  } while (count < 10)
//}
//fun getFortuneCookie() : String {
//  val list = listOf("You will have a great day!", "Things will go well for you today.", "Take it easy")
//  print("Enter your birthday: ")
//  val birthday = readLine()?.toIntOrNull() ?: 0
//  val div = birthday / list.size
//  if (div <= list.size) {
//    return list[div]
//  }
//  return ""
//}
// -- 8. Comida de peixe
//fun main(args: Array<String>) {
//  println("Hello, ${args[0]}!")
//  feedTheFish()
//}
//fun feedTheFish() {
//  val day = randomDay()
//  val food = fishFood(day)
//  println("Today is $day and the fish eat $food")
//}
//fun randomDay() : String {
//  val week = listOf("Monday", "Tuesday", "Wednesday", "Friday", "Saturday", "Sunday")
//  return week[Random().nextInt(7)]
//}
//fun fishFood(day : String) : String {
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
// -- 9. Quiz: Hora de praticarmos
fun main(args: Array<String>) {
  var fortune: String
  for (i in 1..10) {
    fortune = getFortune(getBirthday())
    println("\nYour fortune is: $fortune")
    if (fortune.contains("Take it easy")) break;
  }
}
fun getBirthday() : Int {
  print("Enter your birthday: ")
  return readLine()?.toIntOrNull() ?: 0
}
fun getFortune(birthday: Int) : String {
  val list = listOf("You will have a great day!", "Things will go well for you today.", "Take it easy")
  return when (birthday) {
    in 0..10 -> list[0]
    in 10..20 -> list[1]
    else -> list[2]
  }
}