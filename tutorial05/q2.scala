object Q2 extends App {

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

  // Prints all prime numbers less than n
  def primeSeq(n: Int): Unit = n match {
    case 1 => ();
    case x => {
      primeSeq(x - 1);
      if (prime(x)) println(x);
    }
  }

  primeSeq(10);
}
