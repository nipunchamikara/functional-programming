def easyPaceTime(km: Double): Double =
  8 * km;

def tempoTime(km: Double): Double = 
  7 * km;

@main def q5() = {
  val totalTime = easyPaceTime(2) + tempoTime(3) + easyPaceTime(2);
  println(totalTime);
}