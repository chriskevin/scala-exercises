class Car(val make: String, val reserved: Boolean, val year: Int) {
  override def toString: String = s"Car($make, reserved = $reserved, $year)"
}

class Lotus(val color: String, reserved: Boolean, year: Int) extends
  Car("Lotus", reserved, year: Int)
