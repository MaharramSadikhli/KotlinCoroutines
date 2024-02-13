package com.imsoft.kotlincorountines

fun main() {

    // Dispatchers:

    /*  Dispatchers.Default -> CPU Intensive

    //  Perform CPU-intensive tasks asynchronously without blocking the UI thread: This includes tasks like image processing, data parsing, or complex calculations.
    //  Run background jobs that don't directly impact the UI: Examples include fetching data in the background or saving files.

     */

    /*  Dispatchers.IO -> Input/Output, Networking

    //  Network requests: When fetching data from the internet, Dispatchers.IO ensures these requests don't block the UI thread, keeping the app responsive.
    //  File I/O: Reading or writing files on the device requires using Dispatchers.IO to avoid blocking the UI thread and potential delays in the user interface.
    //  Database interactions: When accessing databases, especially on the main thread, can potentially freeze the UI, using Dispatchers.IO offloads these interactions to background threads.
    //  Other blocking I/O operations: Any task that would block the main thread due to waiting for external resources (sensors, network, disk access) is well-suited for Dispatchers.IO

     */

    /*  Dispatchers.Main -> UI

    //  Updating UI elements: Modifying views, setting text, or triggering UI animations. Ensure all UI-related operations are run on the main thread, as modifying UI elements from other threads can lead to crashes or visual glitches.
    //  Listening to UI events: Responding to user interactions like button clicks or touch events. Since these events occur on the main thread, it's essential to handle them within coroutines launched with Dispatchers.Main to maintain synchronization and avoid unexpected behavior.
    //  Accessing UI-related resources: Using classes like View, LayoutInflater, or Context that depend on the main thread context.

     */

    /*  Dispatchers.Unconfined -> Inherited Dispatcher

    //  Non-deterministic thread switching: It executes the coroutine on the current thread where it's launched and switches to a random thread when resumed. This makes debugging and predicting behavior difficult.
    //  Potential UI blocking: If used on the main thread, it can block UI updates.
    //  Synchronization challenges: Coordinating access to shared resources across concurrently running coroutines using Dispatchers.Unconfined becomes very complex and error-prone.
    //  Limited use cases: There are very few valid reasons to use Dispatchers.Unconfined due to the risks involved.

     */

    /*
    runBlocking {
            launch(Dispatchers.Default) {
                println("Default Thread: ${Thread.currentThread().name}")
            }

            launch(Dispatchers.IO) {
                println("IO Thread: ${Thread.currentThread().name}")
            }

            launch(Dispatchers.Main) {
                println("Main Thread: ${Thread.currentThread().name}")
            }

            launch(Dispatchers.Unconfined) {
                println("Unconfined Thread: ${Thread.currentThread().name}")
            }
        }
     */

}