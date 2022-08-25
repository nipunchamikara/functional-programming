object Q1 extends App {

  // Returns greatest common divisor of a and b
  def GCD(a: Int, b: Int): Int = b match {
    case 0 => a;
    case x => GCD(x, a % x);
  }

  // Checks if a number is a prime number
  def prime(n: Int, i: Int = 2): Boolean = i match {
    case x if (x == n)      => true;
    case x if GCD(n, x) > 1 => false;
    case x                  => prime(n, x + 1);
  }

  println(prime(5));
  println(prime(8))
}
