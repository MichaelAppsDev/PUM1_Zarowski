fun <A> tailToHead(lst: List<A>): List<A>{
    if (lst.isEmpty()) throw IllegalStateException("Empty list")
    if (lst.size == 1) return lst 
    val first = lst.first()  
    val last = lst.last()    

    return listOf(last) + lst.drop(1).dropLast(1) + listOf(first) 
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    println(tailToHead(numbers))
}