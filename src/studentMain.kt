fun main() {
    val student = Student("Jan", "Kowalski")
    //student.imie = "Jan"
    student.uczSie()
    student.nazwisko = "Nowak"
    student.uczSie()

    val student2 = Student("Zygmunt")
    student2.uczSie()

}