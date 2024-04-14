class Lamp(val name:String) {

    //właściwości, pola
    var isOn = false

    //metody
    fun turnOn(){
        isOn = true
    }

    fun turnOff(){
        isOn = false
    }

    fun displayLightStatus(){
        if (isOn){
            println("Lampa $name jest włączona")
        }else{
            println("Lampa $name jest wyłączona")
        }
    }


}