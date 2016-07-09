import scala.io.Source

val source = Source.fromFile("fib.scala")
for (line <- source.getLines) {
  println(line)
}
source.close
