abstract class Animal {
    abstract val food : String
    abstract val location : String
    abstract val animalType: String
    abstract fun makeNoise()
    abstract fun eat()
    abstract fun sleep()
}

class Dog(food: String, location: String) : Animal() {
    override val food: String = food
    override val location: String = location
    override val animalType: String = "Собака"
    val unique: String = "Резиновая кость"

    override fun eat() {
        println("Собака ест $food")
    }

    override fun makeNoise() {
        println("Собака лает")
    }

    override fun sleep() {
        println("Собака спит")
    }
}

class Cat(food: String, location: String) : Animal() {
    override val food: String = food
    override val location: String = location
    override val animalType: String = "Кошка"
    val unique: String = "Рыбка"

    override fun eat() {
        println("Кошка ест $food")
    }

    override fun makeNoise() {
        println("Кошка мурчит")
    }

    override fun sleep() {
        println("Кошка спит")
    }
}
class Horse(food: String, location: String) : Animal() {
    override val food: String = food
    override val location: String = location
    override val animalType: String = "Лошадь"
    val unique: String = "седло"

    override fun eat() {
        println("Лошадь ест $food")
    }

    override fun makeNoise() {
        println("Лошадь фыркнула")
    }

    override fun sleep() {
        println("Лошадь уснула")
    }
}