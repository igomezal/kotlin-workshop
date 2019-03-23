package org.jetbrains.kotlinworkshop.advanced._3InlineFunctions

val foo = run {
    println("Calculating foo...")
    "foo"
}

fun main(args: Array<String>) {
    println(foo)
}