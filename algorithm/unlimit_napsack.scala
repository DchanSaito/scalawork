object Main {
  def main(args: Array[String]): Unit = {
    val n = 3
    val w = Array(3, 4, 2)
    val v = Array(4, 5, 3)
    val c = 7
    val dp = Array.ofDim[Int](n+1, c+1)

    for(i <- 0 until n) {
      for(j <- 0 to c) {
        if (j < w(i)) {
          dp(i+1)(j) = dp(i)(j)
        } else {
          dp(i+1)(j) = math.max(dp(i)(j), dp(i+1)(j - w(i)) + v(i))
        }
      }
    }

    println(dp(n)(c))
  }
}
