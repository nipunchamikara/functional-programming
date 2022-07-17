def discountedPrice(price: Double, discount: Double): Double =
  price * (1 - discount / 100.00);

def shippingCost(copies: Int): Double = (copies <= 50) match {
  case true => 3 * 50;
  case false => 3 * 50 + (copies - 50) * 0.75;
}

def wholesaleCost(coverPrice: Double, copies: Int): Double =
  copies * discountedPrice(coverPrice, 40) + shippingCost(copies); 

@main def q4() = {
  println(wholesaleCost(24.95, 60));
}