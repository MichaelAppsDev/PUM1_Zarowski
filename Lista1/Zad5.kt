fun Armstrong(n: Int): Boolean {
    val length = n.toString().length
    var sum = 0
    var temp = n

    while (temp > 0) {
        val digit = temp % 10
        sum += Math.pow(digit.toDouble(), length.toDouble()).toInt()
        temp /= 10
    }
    return sum == n
}

fun main() {
    print("Wpisz numer: ")
    val number = readln().toInt()
    println(Armstrong(number))
}