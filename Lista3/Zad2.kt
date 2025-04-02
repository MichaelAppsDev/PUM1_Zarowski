fun addToBoolean(): Map<Int, Boolean> {
    val result = mutableMapOf<Int, Boolean>()
    for (i in 1 until 21) {
        result[i] = i % 2 == 0
    }
    return result
}

fun main() {
    println(addToBoolean())
}