object Main {
  def main(args: Array[String]): Unit = {
    val n = 3
    val a = Array(3, 5, 8)
    val m = Array(3, 2, 2)
    val k = 17
    var dp = Array.fill(k + 1)(-1)

    dp(0) = 0
    for(i <- 0 until n) {
      for(j <- 0 to k) {
        if (dp(j) >= 0) {
          dp(j) = m(i)
        } else if (j < a(i) || dp(j - a(i)) <= 0) {
          dp(j) = -1
        } else {
          dp(j) = dp(j - a(i)) - 1
        }
      }
    }

    if (dp(k) >= 0) println("YES")
    else println("NO")
  }
}
