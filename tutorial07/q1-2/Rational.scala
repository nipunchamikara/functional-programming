package Number

class Rational(n: Int, d: Int) {

  private def GCD(num1: Int, num2: Int): Int = num2 match {
    case 0 => if (num1 >= 0) num1 else -num1;
    case x => GCD(num2, num1 % num2);
  }

  def numer = n / GCD(n, d) * (if (d < 0) -1 else 1);
  def denom = d / GCD(n, d) * (if (d < 0) -1 else 1);

  override def toString(): String = numer.toString() + "/" + denom.toString();

  def neg = new Rational(-numer, denom);

  def +(that: Rational): Rational =
    new Rational(
      this.numer * that.denom + that.numer * this.denom,
      this.denom * that.denom
    );

  def -(that: Rational): Rational =
    this + that.neg;
}
