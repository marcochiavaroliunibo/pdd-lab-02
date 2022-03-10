package u02

object Es7 extends App :

  /* Point 7 - Shape */

  enum Shape:
    case Rectangle(base: Double, height: Double)
    case Circle(radius: Double)
    case Square(side: Double)

  def perimeter(shape: Shape): Double = shape match
    case Shape.Rectangle(base, height) => (2 * base) + (2 * height)
    case Shape.Circle(radius) => 2 * 3.14 * radius
    case Shape.Square(side) => 4 * side

  def area(shape: Shape): Double = shape match
    case Shape.Rectangle(base, height) => base * height
    case Shape.Circle(radius) => 3.14 * radius * radius
    case Shape.Square(side) => side * side