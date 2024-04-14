class Student(_imie:String, _nazwisko:String = "Kowalski") {

    //Student ma mieć imię i nazwisko oraz metodę ucz się (wydrukuj wtedy jakiś napis na ekranie)
    //var imie:String = ""
    //var nazwisko:String = ""

    val imie = _imie.uppercase()
        get() = field

    var nazwisko = _nazwisko.uppercase()
        get() = field
        set(nazwisko) {field = nazwisko.uppercase()}



    fun uczSie(){
        println("Student $imie $nazwisko uczy się")
    }
}