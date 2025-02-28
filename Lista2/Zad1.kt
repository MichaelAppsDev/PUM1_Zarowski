fun main() {
    val r: (String, Int) -> String = {s, i -> s.repeat(i) }
    println(r("a", 5))
}