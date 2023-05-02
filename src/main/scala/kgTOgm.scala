
// the program will convert the KG to gram
object kgTOgm
{
  def main(args: Array[String]): Unit ={
    println("You can now easily convert the Kilo Gram into the Gram scale")
    println()
    println("Enter the weight in KG : ")
    var a: Float = scala.io.StdIn.readFloat()
    val b = a * 1000
    println("you have entered weight : " + a + " KG")
    println("the gram conversion is  : " + b + " gram")
  }

}
