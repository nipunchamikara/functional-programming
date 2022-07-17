def toFahr(celcius: Double): Double = 
  celcius * 1.8 + 32.00;

@main def q2() = {
  println(toFahr(35));
}