import kotlin.math.*

// Cálculo de viagem
fun main(args: Array<String>) {
  val lat1 = 40.7128
  val lon1 = -74.0060
  val lat2 = 51.5074
  val lon2 = -0.1278
  val unit = 'K'
  val km = distance(lat1, lon1, lat2, lon2, unit)

  // 1h de preparação
  val preparar = { horasStart: Double ->
    horasStart + 1
  }
  // saindo as 6h, km: de ~5.000km, velocidade de 80km/h
  startCidadeOrigem(preparar(5.0), km, 80.0)
}

fun startCidadeOrigem(preparar: Double, km: Double, velocity: Double) {
  val start: (Double, Double, Double) -> Unit = { horas: Double, km: Double, velocity: Double ->
    cidadeDestino(horas, km, velocity)
  }
  start(preparar, km, 80.00)
}

fun cidadeDestino(horas: Double, km: Double, velocity: Double) {
  val time = km / velocity
  val hours = time.toInt()
  val minutes = (time - hours) * 60
  println("Distancia: ${km.toInt()} km")
  println("Horas saida: $horas")
  println("Velocidade: $velocity km/h")
  println("Duração: ${hours} horas e ${minutes.toInt()} minutos")
}

// funções abaixo geradas pelo chatGPT
fun distance(lat1: Double, lon1: Double, lat2: Double, lon2: Double, unit: Char): Double {
  val theta = lon1 - lon2
  var dist = sin(deg2rad(lat1)) * sin(deg2rad(lat2)) + cos(deg2rad(lat1)) * cos(deg2rad(lat2)) * cos(deg2rad(theta))
  dist = acos(dist)
  dist = rad2deg(dist)
  dist *= 60.0 * 1.1515
  when (unit) {
    'K' -> dist *= 1.609344
    'N' -> dist *= 0.8684
  }
  return dist
}

fun deg2rad(deg: Double): Double {
  return deg * Math.PI / 180.0
}

fun rad2deg(rad: Double): Double {
  return rad * 180 / Math.PI
}
