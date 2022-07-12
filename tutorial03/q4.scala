def isOdd(num: Int): Boolean = (num % 2 == 1)

def isOddOrEven(num: Int): Unit = {
  if (isOdd(num))
    println(num.toString() + " is odd.")
  else
    println(num.toString() + " is even.")
}

@main def Q4() = {
  isOddOrEven(5);
  isOddOrEven(8);
}