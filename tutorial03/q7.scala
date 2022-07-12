def season(month: Int): String = {
  if (month == 12 || month == 1 || month == 2) "Winter"
  else if (3 <= month && month <= 5) "Spring"
  else if (6 <= month && month <= 8) "Summer"
  else if (9 <= month && month <= 11) "Autumn"
  else "Bogus month";
}

@main def Q7() = {
  println(season(5));
  println(season(10));
  println(season(15));
}