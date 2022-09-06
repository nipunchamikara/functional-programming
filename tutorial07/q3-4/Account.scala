package Finance

class Account(no: Int, b: Double) {

  var accNo = no;
  var bal = b;

  override def toString(): String =
    "Acc. No.: " + accNo.toString() + "\nBalance: " + bal.toString();

  def transfer(that: Account, amt: Double): Unit = {
    if (amt > this.bal) {
      println("Not enough funds");
    } else {
      this.bal = this.bal - amt;
      that.bal = that.bal + amt;
    }
  }
}
