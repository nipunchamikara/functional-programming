/* 
  Expected output:
  a)
    ###
    ===
  b)
    ###
    ===
  c)
    ===
  d)
    ===
 */

def print(a: Int, b: Int): Unit = {
  if (a == 1)
    if (b == 1)
      println("***")
  else
    println("####")
  println("===")

  println("");
}

@main def Q5() = {
  // a)
  print(1, 2);

  // b)
  print(1, 3);

  // c)
  print(2, 3);

  // d)
  print(2, 2);
}