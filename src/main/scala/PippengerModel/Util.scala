package PippengerModel

object Util {
  // uses euclidean method to find greatest common denominator
  // between two numbers
  def gcd(a: Int, b: Int): Int = {
    if (b == 0) {
      return a
    } else {
      gcd(b, a % b)
    }
  }

  def mod_inverse(a: Int, p: Int): Int = {
    def mod_inv_recurse(a: Int, p: Int, n: Int): Int = {
      val r = (a * n) % p
      if (r != 1) {
        return mod_inv_recurse(a, p, n+1)
      }
      return n
    }

    if (a < 0) {
      return p - mod_inverse(-a, p)
    }
    mod_inv_recurse(a, p, 0)
  }
}
