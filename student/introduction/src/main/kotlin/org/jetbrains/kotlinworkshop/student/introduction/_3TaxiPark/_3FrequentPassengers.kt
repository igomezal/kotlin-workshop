package org.jetbrains.kotlinworkshop.student.introduction._3TaxiPark

// Find all passengers that were taken by this driver more than once
fun TaxiPark.findFrequentPassengers(driver: Driver): List<Passenger> =
        allPassengers.filter { isFrequent(driver, it) }

fun TaxiPark.isFrequent(driver: Driver, passenger: Passenger) =
        orders.count { it.driver == driver && it.passengers.contains(passenger)} > 1