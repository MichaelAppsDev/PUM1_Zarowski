package Zad2

import Model.DataProvider
import Model.Car
import Model.Cost
import Model.CostType
import java.time.Month

fun printCostsGroupedByMonth(costs: List<Cost>) {
    val groupedCosts = costs.groupBy { it.date.month }
        .mapValues { (_, costList) -> costList.sortedBy { it.date.dayOfMonth } }

    groupedCosts.forEach { (month, costList) ->
        println(month.name)
        costList.forEach { cost ->
            println("${cost.date.dayOfMonth} ${cost.type.name} ${cost.amount} zł")
        }
    }
}

fun main() {
    DataProvider.cars.forEach { car ->
        println("Koszty dla samochodu: ${car.name} (${car.brand} ${car.model})")
        printCostsGroupedByMonth(car.costs)
        println()
    }
}
