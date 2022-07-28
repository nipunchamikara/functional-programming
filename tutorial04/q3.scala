case class Car(name: String, price: Double)

implicit class CarUUID(car: Car) {
  def uuid(): String =
    "car uuid = " + car.name + " - " + car.hashCode().toString();
}

@main def Q3() = {
  val carSample = List(
    Car("bmw 3 series", 20000),
    Car("bmw 5 series", 50000),
    Car("vw passat", 10000),
    Car("vw gold", 12000),
    Car("mazda 3", 15000)
  )

  carSample.foreach(car => println(car.uuid()));
}