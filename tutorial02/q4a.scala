object Q4a extends App {
  def normalSalary(hours: Int): Int =
    250 * hours;
  def overTimeSalary(hours: Int): Int =
    85 * hours;
  def tax(totalSalary: Int): Double =
    12 * totalSalary / 100.00;

  val totalSalary = normalSalary(40) + overTimeSalary(30);
  val takeHomeSalary = totalSalary - tax(totalSalary);
  println(takeHomeSalary);
}
