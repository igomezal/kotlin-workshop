package org.jetbrains.kotlinworkshop.student.introduction._3TaxiPark

// Find the most frequent trip interval duration (or several if there are many)
// among 0-9 minutes, 10-19 minutes, 20-29 minutes etc.
// If there's no duration info, return empty list.
fun TaxiPark.findTheMostFrequentTripDurations(): List<IntRange> {
    val rangesPopularity = kotlin.collections.mutableMapOf<IntRange, Int>()
    orders.forEach {
        val range = it.getDurationRange
        val currentFrequency = rangesPopularity[range] ?: 0
        rangesPopularity[range] = currentFrequency + 1
    }

    val maxValue = rangesPopularity.maxBy { it.value }?.value ?: return emptyList()
    return rangesPopularity.filter { it.value == maxValue }.map { it.key }
}

val Order.getDurationRange: IntRange get() {
    val start = 10 * (duration / 10)
    return kotlin.ranges.IntRange(start, start + 9)
}