object Ceasar extends App {

  // shifts a character by a certain number of steps
  def shiftChar(ch: Char, shift: Int): Char = {

    // upper case characters
    if ('A' <= ch && ch <= 'Z')
      ((ch.toInt - 'A'.toInt + shift + 26).toInt % 26 + 'A'.toInt).toChar;

    // lower case characters
    else if ('a' <= ch && ch <= 'z')
      ((ch.toInt - 'a'.toInt + shift + 26).toInt % 26 + 'a'.toInt).toChar;

    // other characters
    else ch;
  }

  // encrypts a string recursively
  def encrypt(text: String, shift: Int): String = text.splitAt(1) match {

    // base case - empty string
    case ("", _) => "";

    case (x, y) => shiftChar(x.head, shift).toString + encrypt(y, shift);
  }

  // decrypts string by inversing the shift
  def decrypt(text: String, shift: Int): String = encrypt(text, -shift);

  val message = "hello WORLD"
  val encryptedMessage = encrypt(message, 4)

  val decryptedMessage = decrypt(encryptedMessage, 4);

  println("Message: " + message);
  println("Message after encryption: " + encryptedMessage);
  println("Decrypted message: " + decryptedMessage);
}
