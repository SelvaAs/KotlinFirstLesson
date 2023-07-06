package com.example.myfirstkotlinlesson

fun main(){

    for(i in 1 until 20) {
        print("$i ")
        if (i / 2 == 5) {
            break
        }
    }
        print("\nDone with the loop")

        for (i in 1 until 20) {

            // 10/2=5
            // 11/2=5.5 which is 5 in term of an integer
            if (i / 2 == 5) {
              continue
            }
            print("$i ") //1 2 3 4 5 6 7 8 9 12 13 14 15 16 17 18 19


        }
    }
