package PippengerModel

import Util._

object PippengerModel extends App {

  // small sample curve
  val p1707a = BigInt("0")
  val p1707b = BigInt("7")
  val p1707p = BigInt("17")
  val p1707 = new EllipticCurve(p1707a, p1707b, p1707p)
  val xcoord = BigInt("15")
  val ycoord = BigInt("13")
  val cx = new Point(xcoord, ycoord, p1707)

  //println("Print out first 30 EC Points of small example curve. (They will repeat.)")
  //(0 until 30) foreach { n => (cx * n).print() }


  // secp256k1 (curve used in bitcoin)
  val a = BigInt("0000000000000000000000000000000000000000000000000000000000000000", 16)
  val b = BigInt("0000000000000000000000000000000000000000000000000000000000000007", 16)
  val p = BigInt("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFC2F", 16)
  val secp256k1 = new EllipticCurve(a, b, p)
  val gx = BigInt("79BE667EF9DCBBAC55A06295CE870B07029BFCDB2DCE28D959F2815B16F81798", 16)
  val gy = BigInt("483ADA7726A3C4655DA4FBFC0E1108A8FD17B448A68554199C47D08FFB10D4B8", 16)
  val secp256k1gen = new Point(gx, gy, secp256k1)

  //println("Print out first 30 EC Points of SECP256k1")
  //(0 until 30) foreach { n => (secp256k1gen * n).print() }


  // secp256r1
  val r1a = BigInt("ffffffff00000001000000000000000000000000fffffffffffffffffffffffc", 16)
  val r1b = BigInt("5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", 16)
  val r1p = BigInt("ffffffff00000001000000000000000000000000ffffffffffffffffffffffff", 16)
  val secp256r1 = new EllipticCurve(r1a, r1b, r1p)
  val r1gx = BigInt("6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", 16)
  val r1gy = BigInt("4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5", 16)
  val secp256r1gen = new Point(r1gx, r1gy, secp256r1)

  println("Print out first 30 EC Points of SECP256k1")
  (1 until 11) foreach { n => (secp256r1gen * n).print() }
}