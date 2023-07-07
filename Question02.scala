object PatternMatchingExample {
  
  def main(args: Array[String]): Unit = {
    println("Please provide an integer input.")
    val input = scala.io.StdIn.readInt()
    println("The integer you've input is " + message(input))
  }
  
  def message(num: Int): String =  num match{
    case num if num <= 0 => "Negative or Zero"
    case num if num % 2 == 0 => "an Even number"
    case num => "is an Odd number"
  }
}
