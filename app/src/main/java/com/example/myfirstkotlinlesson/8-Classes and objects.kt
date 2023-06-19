package com.example.myfirstkotlinlesson

fun main(){

    var myPhone = callMobilePhone("Android","Samsung","Galaxy S20 Ultra")

}
class callMobilePhone(osName : String,brand : String,model : String){

    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }

}