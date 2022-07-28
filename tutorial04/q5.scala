def toUpper(str: String): String = str.toUpperCase();

def toLower(str: String): String = str.toLowerCase();

def formatString(str: String)(fn: String => String): String = fn(str);

@main def Q5() = {
  println(formatString("Benny")(toUpper));

  println(formatString("Niroshan")((str: String) =>
    str.slice(0, 2).toUpperCase() + str.drop(2).toLowerCase()
  ));

  println(formatString("Saman")(toLower))

  println(formatString("Kumara")((str: String) =>
    str.dropRight(1).capitalize + str(str.length() - 1).toUpper
  ));
}