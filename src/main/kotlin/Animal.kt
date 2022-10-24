// общий класс Animal со свойствами animalKind, tail, color
open class Animal () {
    var animalKind: String = "animal"
    var tail: String = "long"
    var color: String = "black"

    open fun printAll (){
        println ("animalKind: $animalKind, tail: $tail, color: $color")
    }
}