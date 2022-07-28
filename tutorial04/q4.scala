object PatternMatching {
  def main(args: Array[String]) = args(0).toInt match {
    case x if x <= 0       => println("Negative/Zero");
    case x if (x % 2 == 0) => println("Even");
    case x                 => println("Odd");
  }
}
