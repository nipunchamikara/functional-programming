object Q4B extends App {
  /*
    let x be price of ticket
    let y be the attendance

    if x = 15, y = 120
    if x = 10, y = 140
    if x = 20, y = 100

    Therefore, y = -4x + 180
    When y is 0, x = 45;
    0 <= x <= 45

    Profit = x * y - 500 - y * 3
           = x * (-4x + 180) - 500 - (-4x + 180) * 3
   */

  def attendance(price: Double): Double =
    -4 * price + 180;

  def profit(price: Double): Double = {
    val attended = attendance(price);
    return price * attended - 500 - attended * 3;
  }

  def bestPrice(price: Double, maxPrice: Double): Double = {
    if (price > maxPrice) price
    else {
      val bestAbove: Double = bestPrice(price + 0.25, maxPrice);
      if (profit(bestAbove) > profit(price)) bestAbove else price;
    }
  }

  val price = bestPrice(0, 45);
  println("Best Price: " + price);
  println("Maximum Profit: " + profit(price));
}
