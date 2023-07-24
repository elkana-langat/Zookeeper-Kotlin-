import kotlin.math.abs

fun main() {
    val (a, b) = readln().split(' ')
    val (c, d) = readln().split(' ')

    val i = a.toInt()
    val j = b.toInt()
    val k = c.toInt()
    val l = d.toInt()

    val difX = i - k
    val difY = j - l

    if ((abs(difX) == 1 && abs(difY) == 2) || (abs(difX) == 2 && abs(difY) == 1)) {
        println("YES")
    } else {
        println("NO")
    }

}