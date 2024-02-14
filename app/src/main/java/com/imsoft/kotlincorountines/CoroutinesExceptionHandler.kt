package com.imsoft.kotlincorountines

fun main() {
    //this won't work. exceptions propagate in coroutines and we need corutineexceptionhandler
    /*
    lifecycleScope.launch {

        try {
            launch {
                throw Exception("error")
            }
        } catch (e: Exception) {
            print(e.stackTrace)
        }
    }
    */


    /*
        //this will work and it won't be propagated up but it won't be feasible to do everything
        //in try and catch in a coroutine
    */


    /*
    lifecycleScope.launch {

        launch {
            try {
                throw Exception("error")
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
    */

    /*
    val exceptionHandler = CoroutineExceptionHandler { coroutineContext, throwable ->
        println("exception: ${throwable.localizedMessage}")
    }
     */


    /*
        There will be no "executed" output because even if there is an error in one launch,
        the other launches will exit Coroutine Scope without running.
     */
    /*
    lifecycleScope.launch(exceptionHandler) {
        launch {
            throw Exception("error")
        }

        launch {
            delay(1000)
            println("executed")
        }
    }
     */


    /*
        "executed" will be output because even if there is an error in the launch,
        other error-free launches will run because they are written in supervisorScope.
     */
    /*
    lifecycleScope.launch(exceptionHandler) {
        supervisorScope {
            launch {
                throw Exception("error")
            }

            launch {
                delay(1000)
                println("executed")
            }
        }
    }
     */


    /*
    CoroutineScope(Dispatchers.Main + exceptionHandler)
        .launch {
            throw Exception("error in CoroutineScope")
        }
     */
}