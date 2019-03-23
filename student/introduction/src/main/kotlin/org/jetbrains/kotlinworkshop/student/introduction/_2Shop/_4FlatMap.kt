package org.jetbrains.kotlinworkshop.student.introduction._2Shop

fun main(args: Array<String>) {
    val result = listOf("abc", "12").flatMap(String::toList)

    result == listOf('a', 'b', 'c', '1', '2')

    println(result)   // [a, b, c, 1, 2]
}

// Return all products that were ordered by customer
val Customer.orderedProducts: Set<Product> get() {
    // Can be solve with this.orders.map { order -> order.products }.flatten().toSet()
    return this.orders.flatMap { order -> order.products }.toSet()
}

// Return all products that were ordered by at least one customer
val Shop.allOrderedProducts: Set<Product> get() {
    return this.customers.flatMap { customer -> customer.orderedProducts }.toSet()
}
