package org.jetbrains.kotlinworkshop.student.introduction._3TaxiPark

// Find passengers that used discounts for majority of the trips
fun TaxiPark.findSmartPassengers(): Set<Passenger> =
    allPassengers.filter { isSmart(it) }.toSet()

fun TaxiPark.isSmart(passenger: Passenger): Boolean {
    val (withDiscount, withoutDiscount) = orders.filter { it.passengers.contains(passenger) }.partition { it.discount != null }
    return withDiscount.size > withoutDiscount.size
}