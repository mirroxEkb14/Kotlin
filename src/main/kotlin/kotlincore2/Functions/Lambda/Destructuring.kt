package Introduction.Functions.Lambda

fun main() {
    createStudentAndPrintMarks("Alejandro", 23, "Java") { (name, _, subject) ->
        println("name: $name | subject: $subject") // name: Alejandro | subject: Java
    }
}

data class Student(val name: String, val age: Int, val subject: String)

fun createStudentAndPrintMarks(name: String, age: Int, subject: String, operation: (Student) -> Unit) {
    val student = Student(name, age, subject)
    operation(student)
}