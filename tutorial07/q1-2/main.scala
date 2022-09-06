import Number.Rational

object Q1_2 extends App {

  // Question 01
  val r1 = new Rational(5, 6);
  println(r1);
  println(r1.neg);

  val r2 = new Rational(-4, 8);
  println(r2);
  println(r2.neg);

  val r3 = new Rational(12, -9);
  println(r3);
  println(r3.neg);
  println();

  // Question 02
  val x = new Rational(3, 4);
  val y = new Rational(5, 8);
  val z = new Rational(2, 7);
  println(x - y - z);
}
