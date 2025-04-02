data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point) = Point(x + other.x, y + other.y)
    operator fun plus(value: Int) = Point(x + value, y + value)
    operator fun minus(other: Point) = Point(x - other.x, y - other.y)
    operator fun times(other: Point) = Point(x * other.x, y * other.y)
    operator fun inc() = Point(x + 1, y + 1)
    operator fun dec() = Point(x - 1, y - 1)
    operator fun not() = Point(-x, -y)
}

fun main() {
    var p1 = Point(3, 4)
    val p2 = Point(1, 2)
    println("Dodawanie punktów: " + (p1 + p2))
    println("Odejmowanie punktów: " + (p1 - p2))
    println("Mnożenie punktów: " + (p1 * p2))
    println("Inkrementacja: " + (++p1))
    println("Negacja: " + (!p1))
}