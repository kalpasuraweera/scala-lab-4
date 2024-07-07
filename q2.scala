@main def main():Unit = 
    print("Enter a Number: ")
    val userInt:Int = scala.io.StdIn.readInt()
    userInt match{
        case x if x <= 0 => print("Negative/Zero")
        case x if x%2 == 0 => print("Even number")
        case _ => print("Odd number")
    }