package com.imsoft.kotlincorountines

fun main() {

    /*
        Output ->
        //  after 2 second -> user name data download
        // after 2 second -> user age data download (4 second after RUN)
        // User: 23
     */
    /*
    runBlocking {

            val getName = async {
                nameData()
            }

            val getAge = async {
                ageData()
            }

            val username = getName.await()
            val userage = getAge.await()

            println("$username $userage")

        }


        suspend fun nameData(): String {
        delay(2000)
        val userName = "User: "

        println("user name data download")
        return userName

    }

    suspend fun ageData(): Int {
        delay(4000)
        val userAge = 23

        println("user age data download")
        return userAge

    }
     */
}