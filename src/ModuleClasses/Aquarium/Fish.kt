package Aquarium

class Fish(val friendly: Boolean = true, volumeNeeded: Int) {
  val size: Int

  init {
    println("first init block")
  }
  constructor(): this(true, 9) {
    println("running secondary constructor")
  }
  init {
    if (friendly) {
      size = volumeNeeded
    } else {
      size = volumeNeeded * 2
    }
  }

  init {
    println("last init block")
  }
  init {
    println("constructed fish of size ${this.size}")
  }
}

fun makeDefaultFish() = Fish(true, 50)
fun FishExample() {
  val fish = Fish(true, 20)
  println("Is the fish friendly? ${fish.friendly}. "+
          "It needs volume ${fish.size}")
}

fun main(args: Array<String>) {
  FishExample()
  makeDefaultFish()
}