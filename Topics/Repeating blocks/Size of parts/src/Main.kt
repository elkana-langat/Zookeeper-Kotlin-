fun main() {
    val n = readln().toInt()

    var num1 = 0
    var num = 0
    var num0 = 0

    repeat(n) {
        val i = readln().toInt()
        when (i) {
            1 -> {
                num1++
            }
            -1 -> {
                num++
            }
            0 -> {
                num0++
            }
        }
    }

    println("$num0 $num1 $num")
}