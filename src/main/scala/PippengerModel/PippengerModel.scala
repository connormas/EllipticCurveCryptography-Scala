package PippengerModel

object PippengerModel extends App {
  /**
   * This performs bitwise mutiplication. There's no need
   * to do multiplication like this in pure Scala code, but this
   * is a functional model of how a bitwise hardware module
   * could work. Just doing this for personal reference.
   */
  def bitwisemultiplication_Model(a: Int, b: Int): Int = {
    var result = 0
    for (i <- 0 until 32) {
      val operand = b << i
      val mask = a >> i
      if ((mask & 1) == 1) {
        result += operand
      }
    }
    result
  }

  /**
   * This mimics what the MSM part of zkSNARK does. It takes in two vectors.
   * One vectors of scalars, and another vector of points. In multiplies each
   * scalar by its corresponding point and them sums up all the points.
   * (right now, we are just doing this with two int vectors to verify
   * that it is working properly.)
   */
  def zksnarkMSM_model(g: List[Int], e: List[Int]): Int = {
    assert(g.length == e.length, "vectors should be the same length")
    (g.map(x => x * e(g.indexOf(x)))).sum
    // multipy corresponding indexes of arrays and sum them up
  }

  //val g = List(1,2,3,4,5)
  //val e = List(1,2,3,4,5)
  //println(zksnarkMSM_model(g, e))
  val p1707 = new EllipticCurve(0, 7, 17)
  val cx = new Point(15, 13, p1707)
  val cy = new Point(3, 4, p1707)
  val psum = cx + cy
  psum.print()
  val pdub = (cx.double()).double()
  pdub.print()
  val pmul1 = cx * 1
  pmul1.print()
}
