package Finance
import Finance.Account

class Bank(acc: Array[Account]) {

  var accounts: Array[Account] = acc;

  def negativeBal() = accounts.filter(acc => acc.bal < 0);

  def sumBal() =
    accounts.reduce((acc1, acc2) => new Account(0, acc1.bal + acc2.bal));

  def interest(): Unit = {
    accounts.foreach(acc => {
      acc.bal = acc.bal + (if (acc.bal >= 0) acc.bal * 0.05 else acc.bal * 0.1);
    })
  }
}
