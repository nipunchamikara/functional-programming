def volumeOfSphere(radius: Double): Double = 
  4 * math.Pi * math.pow(radius, 3) / 3.00;

@main def q4() = {
  println(volumeOfSphere(5));
}