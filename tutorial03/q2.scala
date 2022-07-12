def max(num1: Int, num2: Int): Int =
  if (num1 > num2) num1 else num2;

@main def Q2() = {
  // Scala has no ? : operator. We can use if-else instead.
  println(max(6, 8));
}