package Quiz3

class SimpleSpice {
  var nome = "curry"
  val nivelPicancia = "mild"
  var heat: Int
    get() = if (nome == "spiciness") 1 else 5
    set(value) {
      nome = value.toString()
    }
}