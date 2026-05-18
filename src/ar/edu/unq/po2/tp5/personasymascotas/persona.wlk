class Persona {
    var property nombre 
    var property fechaNacimiento = new Date()

    method edad(){
        return new Date().year() - fechaNacimiento.year()
    }

}
