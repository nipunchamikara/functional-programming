case class ShoppingCartItem(name: String, price: Double, quantity: Int);

def printShoppingCartItem(item: ShoppingCartItem) = {
  println(item.quantity.toString() + " " + item.name.toString() + " at Rs " + item.price.toString() + " each");
}

def printShoppingCart(cart: List[ShoppingCartItem]): Any = 
  if (!cart.isEmpty) {
    printShoppingCartItem(cart.head);
    printShoppingCart(cart.tail);
  }

def printVanilla(cart: List[ShoppingCartItem]): Any =
  if (!cart.isEmpty) {
    if (cart.head.name == "vanilla ice cream")
      printShoppingCartItem(cart.head);
    else println("Found another item");
    printVanilla(cart.tail);
  }


@main def Q2() = {
  val shoppingCart = List(
    ShoppingCartItem("vanilla ice cream", 3.99, 13),
    ShoppingCartItem("chocolate biscuits", 4, 6),
    ShoppingCartItem("cupcakes", 7.77, 7)
  );
  printShoppingCart(shoppingCart);
  println("");
  printVanilla(shoppingCart);
}