object Q4B extends App {
  /*
    let x be price of ticket
    let y be the attendance

    if x = 15, y = 120
    if x = 10, y = 140
    if x = 20, y = 100

    Therefore, y = -4x + 180

    Profit = x * y - 500 - y * 3
           = x * (-4x + 180) - 500 - (-4x + 180) * 3

    Maxima of function: 1264 when x = 24
   */

  def attendance(price: Double): Double =
    -4 * price + 180;

  def profit(price: Double): Double = {
    val attended = attendance(price);
    return price * attended - 500 - attended * 3;
  }

  println(profit(24));
}
