object StringFormattingExample {
  def toUpper(input: String): String = {
    input.toUpperCase()
  }

  def toLower(input: String): String = {
    input.toLowerCase()
  }

  def formatNames(name: String, index: Int): String = {
    val charToChange = name.charAt(index)
    val charModified = charToChange.toUpper
    name.patch(index, charModified.toString,1)
  }

  def main(args: Array[String]): Unit = {
    println(toUpper("Benny"))
    println(formatNames("Niroshan", 1))
    println(toLower("Saman"))
    println(formatNames("Kumara", 5))
  }
}
