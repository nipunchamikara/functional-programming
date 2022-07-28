def interest(amt: Double): Double = amt match {
  case x if x < 0 => 0;
  case x if x < 20000 => x * 0.02;
  case x if x < 200000 => x * 0.04;
  case x if x < 2000000 => x * 0.035;
  case x => x * 0.065;
}

@main def Q1() = {
  println(interest(-1000));
  println(interest(1000));
  println(interest(10000));
  println(interest(100000));
  println(interest(1000000));
  println(interest(10000000));
}