fun check(N: Int, List: List<Int>): Int {
    for  (i in N until List.size) {

        val preambula = List.subList(i - N, i)
        val current = List[i]

        // Sprawdzamy, czy current można uzyskać jako sumę dwóch różnych liczb z preambuły
        val isValid = preambula.any { a -> preambula.any { b -> a != b && a + b == current } }

        if (!isValid) return current // Znaleźliśmy pierwszą liczbę, która nie spełnia warunku
    }
    return -1 // Nie znaleziono żadnej liczby, która spełnia warunku
}

fun main() {
    val List = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val N = 4

    println(check(N, List)) // 13 (1 + 2 + 3 + 10)

    println(check(2, listOf(1, 2, 3, 4, 5, 6))) // 4
    println(check(5, listOf(35, 25, 15, 25, 47, 40, 62, 55, 65, 95, 102, 117, 150, 182, 127, 219, 299, 277, 309, 576))) // 127
}