@main def Q1() = {
  var absVal: Int = 100; 
  absVal = if (absVal < 0) -absVal else absVal;
  println(absVal);
}