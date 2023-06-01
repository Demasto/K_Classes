class Veterinarian {
    fun treatAnimal(animal: Animal) {
        println("\n${animal.animalType} пришла на прием. У неё с собой ${animal.food}.")
        println("Место жительства: ${animal.location}.")
    }
}