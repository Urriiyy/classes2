//  подкласс травоядных с дополнительным свойством horns
class GrassLover: Animal() {
    var horns = "long"

    override fun printAll(){
        println ("animaKind: $animalKind, tail: $tail, color: $color, horns: $horns")
    }
}