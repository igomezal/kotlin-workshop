package org.jetbrains.kotlinworkshop.student.introduction._3TaxiPark

import java.math.BigDecimal

// Check whether 20% of the drivers make 80% of the profit
fun TaxiPark.checkParetoPrinciple(): Boolean {
    val profit = allDrivers.map { driver -> orders.filter { it.driver == driver }.sumByDouble { it.cost } }.sortedDescending()
    val firstTwenty = profit.take(profit.size / 5).sum()
    val all = profit.sum()
    return BigDecimal(firstTwenty) >= BigDecimal(all) * BigDecimal(0.8)
}