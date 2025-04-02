data class StudentScore(val name: String, val subject: String, val score: Int)

fun analyzeResults(students: List<StudentScore>): Triple<Map<String, List<StudentScore>>, List<StudentScore>, List<String>> {
    val passingScore = 50
    val passedBySubject = students.filter { it.score >= passingScore }.groupBy { it.subject }
    val failed = students.filter { it.score < passingScore }
    val subjectsAllPassed = passedBySubject.filter { it.value.size == students.count { s -> s.subject == it.key } }.keys.toList()
    
    return Triple(passedBySubject, failed, subjectsAllPassed)
}

fun main() {
    val students = listOf(
        StudentScore("Alice", "Math", 85),
        StudentScore("Bob", "Math", 40),
        StudentScore("Charlie", "Physics", 70),
        StudentScore("Dave", "Physics", 30),
        StudentScore("Eve", "Math", 90)
    )
    val result = analyzeResults(students)
    println("Zaliczone przedmioty: " + result.first)
    println("Niezdani studenci: " + result.second)
    println("Przedmioty, które wszyscy zdali: " + result.third)
}