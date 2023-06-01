fun main(args: Array<String>) {

    val arrayOfAnimal = arrayOf(
        Dog("банан", "Саратов"),
        Cat("вискас", "Рязань"),
        Horse("сено", "Москва")
    )
    val doctor = Veterinarian()

    for(animal in arrayOfAnimal) {
        doctor.treatAnimal(animal)
        animal.makeNoise()
        animal.eat()
        animal.sleep()
        println("Название класса - ${animal.javaClass.kotlin.simpleName}")
    }

}