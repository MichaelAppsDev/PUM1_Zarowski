
import java.time.Month

fun groupedCostMap(costs: List<Cost>): Map<Month, List<Cost>> {
    return costs.groupBy { it.date.month }
        .mapValues { (_, costList) -> costList.sortedBy { it.date.dayOfMonth } }
}

fun main() {
    val result = groupedCostMap(DataProvider.generalCosts)
    println(result)
}