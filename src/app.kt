fun main(){
    //Declaración y visualización de parámetros
    var raton = Raton("bluetooth")
    println("Tipo de raton:  ${raton.tipo}")

    var pantalla = Pantalla("Samsung", 13)
    println("Marca de monitor: ${pantalla.marca}. Y tamaño: ${pantalla.pulgadas}")

    var cpu = Cpu(250.0.toFloat(),6.0.toFloat())
    println("Capacidad de memoria(cpu) = ${cpu.memoria}. Y velocidad(cpu) = ${cpu.velocidad}")

    //Creación de un objeto
    var computer = Ordenador(Raton("laser"),Pantalla("hp",14),Cpu(1.0F, 8.0F))
    println("Caracteristicas del ordenador: un raton tipo ${raton.tipo}, una ${computer.pantalla} y una cpu de memoria = ${computer.cpu.memoria}Tb y velocidad =  ${computer.cpu.velocidad}Gb" )


}