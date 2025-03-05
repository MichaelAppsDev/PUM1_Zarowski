fun countElements(lst: List<List<String>>): Map<String, Int> {
    return lst.flatten()
        .groupingBy { it }
        .eachCount()


}

fun main() {
    val input = listOf(
        listOf("a", "b", "c"),
        listOf("c", "d", "f"),
        listOf("d", "f", "g")
    )

    println(countElements(input)) // {a=1, b=1, c=2, d=2, f=2, g=1}
}