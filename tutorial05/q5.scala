object Q5 extends App {

  // Adds all even numbers less than n
  def addEvenLessThan(n: Int): Int = n match {
    case 0                 => 0;
    case x if (x % 2 == 1) => addEvenLessThan(x - 1);
    case x                 => x + addEvenLessThan(x - 2);
  }

  println(addEvenLessThan(5));
}
