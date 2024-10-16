// Класс зоо-магазина

class PetStore {
    fun identifyAnimal(animal: Animal): String {
        return when (animal) {
            is Dog -> "Собака породы: ${animal::class.simpleName}, Прикус: ${animal.biteType}"
            is Cat -> "Кошка породы: ${animal::class.simpleName}, Поведение: ${animal.behaviorType}"
            else -> "Неизвестное животное"
        }
    }
}

// Основная функция

fun main() {
    val husky = Husky(weight = 30.0, age = 5)
    val corgi = Corgi(weight = 10.0, age = 3)
    val scottishFold = ScottishFoldCat(weight = 5.0, age = 2)
    val siamese = SiameseCat(weight = 4.0, age = 2)

    val petStore = PetStore()

    println(petStore.identifyAnimal(husky))         // Собака породы: Husky, Прикус: STRAIGHT
    println(petStore.identifyAnimal(corgi))         // Собака породы: Corgi, Прикус: UNDERBITE
    println(petStore.identifyAnimal(scottishFold))  // Кошка породы: ScottishFoldCat, Поведение: PASSIVE
    println(petStore.identifyAnimal(siamese))       // Кошка породы: SiameseCat, Поведение: ACTIVE
}
