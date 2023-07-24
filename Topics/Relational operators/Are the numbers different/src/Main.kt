fun main() {
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val num3 = readln().toInt()

    val areDifferent = areNumbersDifferent(num1, num2, num3)
    println(areDifferent)
}

fun areNumbersDifferent(num1: Int?, num2: Int?, num3: Int?): Boolean {
    // Check if any two numbers are equal
    return (num1 != num2) && (num1 != num3) && (num2 != num3)
}
