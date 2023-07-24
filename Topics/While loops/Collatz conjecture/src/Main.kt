fun main() {
    // Get the input number 'n'
    val n = readlnOrNull()?.toIntOrNull()

    if (n != null && n > 0) {
        // Generate the Collatz sequence
        var currentNumber = n
        print("$currentNumber ")

        while (currentNumber != 1) {
            if (currentNumber != null) {
                if (currentNumber % 2 == 0) {
                    currentNumber /= 2 // Divide even numbers by 2
                } else {
                    currentNumber = currentNumber * 3 + 1 // Multiply odd numbers by 3 and add 1
                }
            }
            print("$currentNumber ")
        }
    } else {
        println("Invalid input. Please enter a positive integer.")
    }
}
