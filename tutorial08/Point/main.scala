import Point.Point

@main
def main(): Unit = {
  var p1: Point = Point(10, 0);
  var p2: Point = Point(8, 6);

  // a. adding two points
  var p3: Point = p1 + p2;
  println(p3);

  // b. move point p1
  p1 = p1.move(-5, 2);
  println(p1);

  // c. distance between p1 and p2
  val dist = p1.distance(p2);
  println(dist);

  // d. invert x and y coordinates of p2
  p2 = p2.invert();
  println(p2);
}
