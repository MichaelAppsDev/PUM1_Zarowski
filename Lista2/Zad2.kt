val <T> List<T>.head: T
    get() = this.first()  

val <T> List<T>.tail: List<T>
    get() = this.drop(1) 

fun main() {
    val numbers = listOf(10, 20, 30, 40)
    
    println(numbers.head) // 10
    println(numbers.tail) // [20, 30, 40]
}
