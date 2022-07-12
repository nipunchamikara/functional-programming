def gradeA(average: Double): String = {
  if (0 <= average && average <= 39.0) "Fail"
  else if (average <= 54.0) "Pass"
  else if (average <= 69.0) "Good"
  else if (69.0 < average) "Very Good"
  else "Invalid Marks";
}

def gradeB(average: Double): String = {
  if (0 <= average && average <= 39.0) "Fail" else {
    if (average <= 54.0) "Pass" else {
      if (average <= 69.0) "Good" else {
        if (69.0 < average) "Very Good"
        else "Invalid Marks";
      }
    }
  }
}

@main def Q6() = {
  // a and c
  println(gradeA(60));

  // b
  println(gradeB(60));
}