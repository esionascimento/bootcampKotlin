package ModuleClasses.Aquarium

class Aquarium(
  var length: Int = 100, var width: Int = 20, var height: Int = 40
) {

  var volume: Int
    get() = width * height * length / 1000
    set(value) {
      height = (value * 1000) / (width * length)
    }

  var water = volume * 0.9

  /**
   * numberOfFish: Int
   * Estabelecer 1 centímetro de peixe para cada 2 litros
   */
  constructor(numberOfFish: Int): this() {
    val water: Int = numberOfFish * 2000 // cm3
    val tank: Double = water + water * 0.1
    height = (tank / (length * width)).toInt()
  }
}