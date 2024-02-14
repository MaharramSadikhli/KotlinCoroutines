package com.imsoft.kotlincorountines

fun main() {
    /*
        Output ->
            // after 2 second -> first job
            // second job
            // first job ended
     */

    /*

        runBlocking {

            val firstJob = launch {
                delay(2000)
                println("first job")

                val secondJob = launch {
                    println("second job")
                }
            }

            // when firstJob finish
            firstJob.invokeOnCompletion {
                println("first job end")
            }

        }
     */


    // ---------------------------------------------------------------------------------------------

    /*
        Output ->
            // first job ended
     */

    /*

        runBlocking {

            val firstJob = launch {
                delay(2000)
                println("first job")

                val secondJob = launch {
                    println("second job")
                }
            }

            // when firstJob finish
            firstJob.invokeOnCompletion {
                println("first job end")
            }

            firstJob.cancel()
        }
     */

}