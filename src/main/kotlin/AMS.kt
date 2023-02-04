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
fun main(args: Array<String>) {
  var count = 0
  do {
    val response = getFortuneCookie()
    println("Your fortune is: $response")
    if ("Take it easy" === response) count = 10
    count += 1
  } while (count < 10)
}
fun getFortuneCookie() : String {
  val list = listOf("You will have a great day!", "Things will go well for you today.", "Take it easy")
  print("Enter your birthday: ")
  val birthday = readLine()?.toIntOrNull() ?: 0
  val div = birthday / list.size
  if (div <= list.size) {
    return list[div]
  }
  return ""
}