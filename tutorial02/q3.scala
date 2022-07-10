object Q2 extends App {
  var a: Int = 2;
  var b: Int = 3;
  var c: Int = 4;
  var d: Int = 5;
  var k: Float = 4.3f;

  var g: Int = _; // initialises to zero

  // a
  b -= 1;
  println(b * a + c * d); // --b and d-- not valid syntax in scala
  d -= 1;

  // b
  println(a);
  a += 1;

  // c
  println(-2 * (g - k) + c);

  // d
  println(c);
  c += 1;

  // e
  c += 1;
  c = c * a;
  println(c);
  a += 1;
}
