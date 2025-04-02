fun <T> perm(list: List<T>): List<List<T>> {
    if (list.size <= 1) return listOf(list)
    return list.flatMap { elem ->
        perm(list - elem).map { sublist -> listOf(elem) + sublist }
    }
}

fun main() {
    val testList = listOf(1, 2, 3)
    println("Permutacje: " + perm(testList))
}
