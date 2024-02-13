@file:OptIn(DelicateCoroutinesApi::class)

package com.imsoft.kotlincorountines

import kotlinx.coroutines.*
fun main() {

    // Scope
    // Global Scope, runBlocking, CoroutineScope


    // Global Scope
    /*
    //  When you run this code, 100 nested coroutines are launched concurrently.
    //  Each nested coroutine prints "Global Scope" to the console, resulting in 100 identical messages on the console.
     */
    /*
    GlobalScope
        .launch {
            repeat(100) {
                launch {
                    println("Global Scope")
                }
            }
        }
     */

    /*
    //  Output ->
    //  global scope start
    // global scope end
    // after 5s -> global scope
     */
    /*
    println("global scope start")
    GlobalScope
        .launch {
            delay(500)
            println("global scope")
        }

    println("global scope end")
     */


    // ---------------------------------------------------------------------------------------------


    // runBlocking
    /*
    //  Output ->
    //  run blocking start
    //  after 5 second -> run blocking
    //  run blocking end
     */
    /*
    println("run blocking start")

        runBlocking {
            launch {
                delay(5000)
                println("run blocking")
            }
        }

        println("run blocking end")
     */


    // ---------------------------------------------------------------------------------------------


    // Coroutine Scope
    /*
    //  Output ->
    // coroutine scope start
    // coroutine scope end
    // after 5 second -> coroutine scope
     */
    /*
    println("coroutine scope start")

        CoroutineScope(Dispatchers.Default)
            .launch {
                delay(5000)
                println("coroutine scope")
            }

        println("coroutine scope end")
     */


    // ---------------------------------------------------------------------------------------------


    // runBlocking and coroutine scope
    /*
    //  Output ->
    // after 3 second -> coroutine scope
    // after 2 second -> run blocking (5 seconds after RUN)
     */
    /*
    runBlocking {
            launch {
                delay(5000)
                println("run blocking")
            }

            coroutineScope {
                launch {
                    delay(3000)
                    println("coroutine scope")
                }
            }

        }
     */



}