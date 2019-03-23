package org.jetbrains.kotlinworkshop.student.introduction._3TaxiPark

// Find all passengers having more than 'minTrips' number of trips
fun TaxiPark.findFaithfulPassengers(minTrips: Int): List<Passenger> =
        allPassengers.filter { this.isFaithful(it, minTrips) }

fun TaxiPark.isFaithful(passenger: Passenger, minTrips: Int): Boolean =
        orders.count { it.passengers.contains(passenger) } > minTrips
