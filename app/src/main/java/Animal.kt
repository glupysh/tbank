// Интерфейсы

interface Animal {
    val weight: Double  // Вес в килограммах
    val age: Int        // Возраст в годах
}

interface Dog : Animal {
    val biteType: BiteType  // Тип прикуса
}

interface Cat : Animal {
    val behaviorType: BehaviorType  // Тип поведения
}

// Перечисления

enum class BiteType {
    STRAIGHT,  // Прямой прикус
    OVERBITE,  // Перекус
    UNDERBITE  // Недокус
}

enum class BehaviorType {
    ACTIVE,    // Активная
    PASSIVE    // Пассивная
}

// Классы

class Husky(override val weight: Double, override val age: Int) : Dog {
    override val biteType: BiteType = BiteType.STRAIGHT
}

class Corgi(override val weight: Double, override val age: Int) : Dog {
    override val biteType: BiteType = BiteType.UNDERBITE
}

class ScottishFoldCat(override val weight: Double, override val age: Int) : Cat {
    override val behaviorType: BehaviorType = BehaviorType.PASSIVE
}

class SiameseCat(override val weight: Double, override val age: Int) : Cat {
    override val behaviorType: BehaviorType = BehaviorType.ACTIVE
}
