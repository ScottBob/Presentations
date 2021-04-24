case class Pair(key: Int, value: Double)

implicit class StringExtension(str: String) {
  def parsePair(): Pair = {
    val columns = str.split(",")
    Pair(columns(0).toInt, columns(1).toDouble)
  }
}

val pair: Pair = "1,150.0".parsePair()
