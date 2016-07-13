object Main {
  def bubble(ar: Array[Int]): Array[Int] = {
    var flag = 1
    var i = 0
    while (flag == 1) {
      flag = 0
      for (j <- ar.length - 1 to i + 1 by -1) {
        if (ar(j) < ar(j-1)) {
          val tmp = ar(j)
          ar(j) = ar(j-1)
          ar(j-1) = tmp
          flag = 1
        }
      }
      i += 1
    }
    ar
  }

  def main(args: Array[String]): Unit = {
    val test = Array(549, 43, 435, 2, 3, 1, 7, 23456, 343, 56)
    val res = bubble(test)
    for (r <- res) println(r)
  }
}
