import scala.io.StdIn.readLine

def toFahr(celcius: Double): Double = 
  celcius * 9 / 5.00 + 32;

def toCelcius(fahr: Double): Double = 
  (fahr - 32) * 5 / 9.00;

@main def Q8() = {
  print("Enter temperature: ");
  val temp: Double = readLine().toDouble;

  println("1. To Celcius");
  println("2. To Fahrenheit");
  print("Enter option: ");
  val op: Int = readLine().toInt;

  val result = if (op == 1) toCelcius(temp) else toFahr(temp);

  println(result);
}