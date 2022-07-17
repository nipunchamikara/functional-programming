def areaOfDisk(radius: Double): Double = 
  math.Pi * math.pow(radius, 2);

@main def q1() = {
  println(areaOfDisk(5));
}