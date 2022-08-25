object Q4 extends App {

  // Checks if a number is even
  def isEven(n: Int): Boolean = n match {
    case 0 => true;
    case x => isOdd(x - 1);
  }

  // Checks if a number is odd
  def isOdd(n: Int) = !isEven(n);

  def evenOrOdd(n: Int) = isEven(n) match {
    case true  => println(n + " is even");
    case false => println(n + " is odd");
  }

  evenOrOdd(5);
  evenOrOdd(8);
}
