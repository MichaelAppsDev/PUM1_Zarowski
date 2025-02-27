fun printNumbers(n: Int) {
    for (i in 1..n) {
        var output = ""

        if (i % 3 == 0) output += "trzy"
        if (i % 5 == 0) output += "piec"
        if (i % 7 == 0) output += "siedem"
        if (i % 11 == 0) output += "jedenascie"
        if (i % 13 == 0) output += "trzynascie"

        if (output.isEmpty()) {
            println(i)
        } else {
            println(output)
        }
    }
}

fun main() {
    printNumbers(15)
}
