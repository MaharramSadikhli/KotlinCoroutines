package com.imsoft.kotlincorountines

fun main() {

    // withContext()
    /*
        When is it used?
            //  Switch to a different execution context:
                //  This is its primary purpose.
                //  You can use it to move a coroutine from one dispatcher (e.g., Dispatchers.Main) to another (e.g., Dispatchers.IO) for specific tasks.
                //  This ensures optimal execution based on the nature of the operation.
            //  Execute a block of code with a specific dispatcher:
                //  Use it to confine a block of code to run within a specific dispatcher context.
                //  This helps manage resource usage and ensures proper synchronization within that context.
            //  Return a value from the block:
                //  Unlike launch, which executes asynchronously without returning a value,
                //  withContext allows you to return a value from the block of code it executes.
     */

    /*
        What it does?
            //  Temporarily changes the coroutine's execution context:
                //  It suspends the current coroutine and switches it to the provided dispatcher
                //  for the duration of the code block within withContext.
                //  Once the block finishes, the coroutine resumes in its original context.
            //  Blocks the current coroutine:
                //  Unlike launch, which executes asynchronously,
                //  withContext blocks the current coroutine until the code block within it completes.
     */

    // Example:

    /*
        Output ->
            // Context: [StandaloneCoroutine{Active}@a325176, Dispatchers.Default]
            // Context: [DispatchedCoroutine{Active}@382d377, Dispatchers.IO]
     */

    /*

        runBlocking {
            launch(Dispatchers.Default) {
                println("Context: $coroutineContext")

                withContext(Dispatchers.IO) {
                    println("Context: $coroutineContext")
                }
            }
        }

     */
}