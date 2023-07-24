fun main() {
    val invitation = readLine().toBoolean()
    val hasGift = readLine().toBoolean()

    if (invitation && hasGift) {
        println(true)
    } else {
        println(false)
    }

}