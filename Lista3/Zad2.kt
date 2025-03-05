fun addToBoolean(): Map<Int, Boolean> {
    val result = mutableMapOf<Int, Boolean>()
    for (i in 1 until 21) {
        if (i % 2 == 0) {
            result += Pair(i, true)
        } else {
            result += Pair(i, false)
        }
    }
    return result
}

fun main() {
    println(addToBoolean())
}