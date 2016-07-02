object Fib {
  def fib(n: Int): Int = {
    def go(n: Int): Int = {
      if (n <= 2) 1
      else go(n-1) + go(n-2)
    }
    go(n)
  }

  def fib2(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, prev: Int, cur: Int): Int = {
      if (n == 0) prev
      else go(n-1, cur, prev + cur)
    }
    go(n, 0, 1)
  }

  def main(args: Array[String]): Unit = {
    println(fib(5))
    println(fib2(5))
  }
}

