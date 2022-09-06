import Finance.Account
import Finance.Bank

object Q3_4 extends App {

  def printAccounts(arr: Array[Account]): Unit = {
    println("Accounts:")
    arr.foreach(acc => println(acc))
  }

  val bank1 = new Bank(
    Array(
      new Account(101, 450),
      new Account(102, 300),
      new Account(103, -200)
    )
  );

  // Question 03

  println(bank1.accounts(0));
  println(bank1.accounts(1));
  println();

  // Transfering with enough funds

  bank1.accounts(0).transfer(bank1.accounts(1), 300);
  println(bank1.accounts(0));
  println(bank1.accounts(1));
  println();

  // Transfering with not enough funds

  bank1.accounts(0).transfer(bank1.accounts(1), 300);
  println(bank1.accounts(0));
  println(bank1.accounts(1));
  println();

  // Question 04

  printAccounts(bank1.negativeBal());
  println();

  println("Total balance: " + bank1.sumBal().bal.toInt);
  println();

  bank1.interest();
  printAccounts(bank1.accounts);
  println();
}
