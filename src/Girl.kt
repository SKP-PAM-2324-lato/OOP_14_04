class Girl(val name: String, _age: Int) {

    var age = _age
        get() = field
        set(value) {
            field = if (value < 18)
                        18
                    else if (value >=18 && value <= 30)
                        value
                    else
                        value -3
        }
}