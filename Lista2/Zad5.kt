fun <A> setHead(lst: List<A>, item: A): List<A> {
    return listOf(item) + lst.drop(1)
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    println(setHead(numbers, 0))  // [0, 2, 3, 4, 5]
}