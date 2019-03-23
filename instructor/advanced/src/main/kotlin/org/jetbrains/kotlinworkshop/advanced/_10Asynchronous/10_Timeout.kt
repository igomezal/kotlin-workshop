package org.jetbrains.kotlinworkshop.advanced._10Asynchronous

import kotlinx.coroutines.experimental.*


fun main(args: Array<String>) = runBlocking {
    withTimeout(3000) {
        timeoutProcess()
    }
}

suspend fun timeoutProcess() {
    delay(5000)
    println("timeoutProcess called")
}
