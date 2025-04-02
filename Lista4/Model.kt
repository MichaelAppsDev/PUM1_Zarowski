package Model

import java.time.LocalDate
import kotlin.random.Random

enum class CostType(val costType: String) {
    REFUELING("Tankowanie"),
    SERVICE("Serwis"),
    PARKING("Parking"),
    INSURANCE("Ubezpieczenie"),
    TICKET("Mandat")
}

data class Cost(
    val type: CostType,
    val date: LocalDate,
    val amount: Int
)

data class Car(
    val name: String,
    val brand: String,
    val model: String,
    val yearOfProduction: Int,
    val costs: List<Cost>
)

object DataProvider {
    fun generateCosts(size: Int): List<Cost> {
        return List(size) {
            Cost(
                CostType.values()[Random.nextInt(CostType.values().size)],
                LocalDate.of(2024, Random.nextInt(1, 13), Random.nextInt(1, 28)),
                Random.nextInt(5000)
            )
        }
    }

    val cars = listOf(
        Car("Domowy", "Skoda", "Fabia", 2002, generateCosts(100)),
        Car("Służbowy", "BMW", "Coupe", 2015, generateCosts(50)),
        Car("Kolekcjonerski", "Fiat", "125p", 1985, generateCosts(10))
    )
}
