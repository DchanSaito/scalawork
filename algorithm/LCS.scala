object Main {
  def main(args: Array[String]) = {
    val a = "abedf"
    val b = "asbeq"
    var dp = Array.ofDim[Int](a.length+1, b.length+1)

    for(i <- 0 until a.length) {
      for(j <- 0 until b.length) {
        if (a(i) == b(j)) {
          dp(i+1)(j+1) = dp(i)(j) + 1
        } else {
          dp(i+1)(j+1) = math.max(dp(i)(j+1), dp(i+1)(j))
        }
      }
    }
    println(dp(a.length)(b.length))
  }
}
