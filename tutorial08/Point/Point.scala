package Point

case class Point(x: Int, y: Int) {

  def +(that: Point): Point =
    Point(x + that.x, y + that.y);

  def move(dx: Int, dy: Int): Point = Point(
    x = x + dx,
    y = y + dy
  )

  def distance(that: Point): Double =
    Math.sqrt(Math.pow(x - that.x, 2) + Math.pow(y - that.y, 2))

  def invert(): Point =
    Point(y, x);

}
