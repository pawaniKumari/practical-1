object Main extends App {

  // Q1
  def diskArea(r: Int) = { math.Pi * r * r }
  println("Area of the disk is : " + diskArea(5))

  // Q2
  def fahrenheit(c: Int) = { (c * 1.8000) + 32.00 }
  println("Temperature in fahrenheit is:" + fahrenheit(35))

  // Q3
  def sphereVolume(r: Int) = { 4 / 3 * math.Pi * r * r * r }
  println("Volume of the sphere is:" + sphereVolume(5))

  // Q4
  def totCoverPrice(n: Int) = { n * 24.95 }
  println("Total cover price is :" + totCoverPrice(60))

  def discountAmount(totCoverPrice: Double) = { totCoverPrice * 0.4 }
  println("Discount amount is:" + discountAmount(totCoverPrice(60)))

  def shippingCost(n: Int): Double = if (n <= 50) { n * 3 }
  else { ((n - 50) * 0.75) + (50 * 3) }
  println("Shipping cost  is :" + shippingCost(60))

  def totalCost(
      totCoverPrice: Double,
      shippingCost: Double,
      discountAmount: Double
  ) = {
    (totCoverPrice + shippingCost) - discountAmount
  }
  println(
    "Total cost is :" + totalCost(
      totCoverPrice(60),
      shippingCost(60),
      discountAmount(totCoverPrice(60))
    )
  )

  // Q5
  def totTimeTaken(easyDistance: Int, tempoDistance: Int) = {
    (easyDistance * 8) + (tempoDistance * 7)
  }
  println("Total time taken is :" + totTimeTaken(4, 3))
}
