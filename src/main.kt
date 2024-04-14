fun main() {

    val lamp1 = Lamp("lampka na biurku")
    lamp1.turnOn()
    lamp1.displayLightStatus()

    val lamp2 = Lamp("Lampa w salonie")
    lamp2.displayLightStatus()
    lamp2.turnOn()
    lamp1.turnOff()
    lamp1.displayLightStatus()
    lamp2.displayLightStatus()
}