
fun main(args: Array<String>) {
    var num1:Double
    var num2:Double
    var result: Double
    var operator: String
    println("Enter Number")
    num1 = readLine()!!.toDouble()
    println("Enter number")
    num2 = readLine()!!.toDouble()
    println("Enter an operator (+, -, *, /):")
    operator = readLine()!!
    result = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> num1 / num2
        else -> throw IllegalArgumentException("Invalid Operator")
    }
    println(result)
}