
fun main() {
    val goat = GrassLover()       // объект goat
    goat.animalKind= "Goat"
    goat.color = "white"
    goat.tail = "short"

    val kow = GrassLover()       // объект kow
    kow.animalKind= "Kow"
    kow.color = "brown"
    kow.horns = "short"

    val lion = MeatLover()       // объект lion
    lion.animalKind = "Lion"
    lion.color = "yellow"


    val tiger = MeatLover()       // объект tiger
    tiger.animalKind = "Tiger"
    tiger.color = "orange-black"
    tiger.teeth = "very sharp"

    val animalList = listOf<Animal>(goat, kow, lion, tiger)    // список объектов

    println()
    for (ani in animalList) {      // вывод свойств объектов 
       ani.printAll()
    }
}