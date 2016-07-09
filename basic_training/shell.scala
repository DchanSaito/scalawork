import scala.sys.process._
import scala.language.postfixOps

"ls" #> new java.io.File("test.txt") #&&
"ls" #&&
"rm -f test.txt" #&&
"ls" !
