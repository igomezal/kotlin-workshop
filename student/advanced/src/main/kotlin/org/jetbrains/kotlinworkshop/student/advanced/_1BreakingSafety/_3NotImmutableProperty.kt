package org.jetbrains.kotlinworkshop.student.advanced._1BreakingSafety

class MyClass {
    // Change the implementation of 'myProperty' to make it return different values each time.
    // You may add additional properties if you need.
    private var counter = 0

    val myProperty: Int
        get() = counter++

    /*
     *
     * val myProperty: Int
     *     get() = (Math.random() * 10).toInt()
     *
    */
}
