def calculateInterest(deposit: Double): Double = {
  deposit match {
    case d if d <= 20000 => d * 0.02
    case d if d <= 200000 => d * 0.04
    case d if d <= 2000000 => d * 0.035
    case d => d * 0.065
  }
}

// Example usage:
val depositAmount = 50000.0
val interest = calculateInterest(depositAmount)
println(s"The interest earned on Rs. $depositAmount is Rs. $interest")
