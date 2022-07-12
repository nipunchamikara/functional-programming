import scala.io.StdIn.readLine

def calc(num1: Double, op: String, num2: Double): Double = {
  if (op == "+") num1 + num2;
  else if (op == "-") num1 - num2;
  else if (op == "*") num1 * num2;
  else num1 / num2;
}

@main def Q9() = {
  val num1: Double = readLine().toDouble;  
  val op: String = readLine();
  val num2: Double = readLine().toDouble;
  println(calc(num1, op, num2));
}