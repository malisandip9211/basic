
// the following program finds the largest among the three number
object large {
  def main(args: Array[String]): Unit = {
    println("find the largest among three number")
    println()
    println("please enter valid INTEGER number")
    println()
    print("Enter First Number : ")
    val num1: Int = scala.io.StdIn.readInt()

    print("Enter Second Number : ")
    val num2: Int = scala.io.StdIn.readInt()

    print("Enter Third Number : ")
    val num3: Int = scala.io.StdIn.readInt()
    var large: Int = 0


    large = if (num1 > num2 && num1 > num3) num1 else if (num2 > num1 && num2 > num3) num2 else num3

    println("Largest among the entered number is : " + large)

  }
}
