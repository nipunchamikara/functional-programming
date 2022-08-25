object Q6 extends App {

  // Finds nth Fibonacci number
  def fib(n: Int): Int = n match {
    case x if (x < 2) => x;
    case x            => fib(x - 1) + fib(x - 2);
  }

  // Prints n fibonacci numbers
  def nFib(n: Int): Unit = n match {
    case 0 => ();
    case x => {
      nFib(x - 1);
      println(fib(x - 1));
    }
  }

  nFib(5);
}
