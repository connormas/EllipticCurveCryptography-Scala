package PippengerModel

/**
 * This class represents a point on an elliptic curve in a finite field.
 * It takes just two arguments, an X and Y coordinate. There are a number
 * of operations defined for these types of points.
 */
class Point(coord_x: Int, coord_y: Int, ec: EllipticCurve) {
  val x: Int = coord_x
  val y: Int = coord_y
  val curve: EllipticCurve = ec

  def double() = {
    val l = (3 * this.x * this.x + this.curve.a) / (2 * this.y)
    val new_x = ((l * l)  - this.x - this.x) //% this.curve.p
    val new_y = ((l * (this.x - new_x)) - this.y) //% this.curve.p
    new Point(new_x, new_y, this.curve)
  }

  def +(that: Point): Point = {
    if (this == that) {
      return this.double()
    }
    val l = (that.y - this.y) / (that.x - this.x)
    val new_x = ((l * l)  - this.x - that.x) //% this.curve.p
    val new_y = ((l * (this.x - new_x)) - this.y) //% this.curve.p
    new Point(new_x, new_y, this.curve)
  }

  def unary_- = new Point(this.x, this.y * -1, this.curve)

  def *(n: Int): Point = {
    def mult_helper(orig: Point, acc: Point, n: Int): Point = {
      if (n == 1) {
        return acc
      } else {
        val new_total = orig + acc
        mult_helper(orig, new_total, n-1)
      }
    }
    mult_helper(this, this, n)
  }

  def ==(that: Point) = {
    this.x == that.x && this.y == that.y
  }

  def print() = {
    println(s"I am the point (${this.x}, ${this.y})")
  }
}

