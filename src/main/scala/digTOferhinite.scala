
// degree to ferhenite conversion
object digTOferhinite {
  def main(args: Array[String]): Unit ={
    println("You can now easily convert the Degree (Celcious)  into the Ferhenite scale")
    println()
    println("Enter the Temperature in DEGREE" + " : ")
    var a: Float = scala.io.StdIn.readFloat()
    val b = (a * 9 / 5) + 32
    println("you have entered Temperature : " + a + " C")
    println("the Ferhenite conversion is  : " + b + " F")

  }
}
