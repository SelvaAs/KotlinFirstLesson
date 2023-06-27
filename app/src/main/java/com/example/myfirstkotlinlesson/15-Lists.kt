package com.example.myfirstkotlinlesson

fun main() {

    val months = listOf("jan", "Feb")
    val anyTypes = listOf(1, 2, 3, "Jan", true, false)
    println(anyTypes.size) //6
    println(months[1]) //Feb

    for (month in months) {
        println(month) //jan Feb
    }
    // months array listine bir sey ekleyemem cunku immutabledir
    // eger bir seyler eklemek istersem onu degistirilebilir yapmaliyim

    val addionalMonths = months.toMutableList()
    val newMonths = arrayOf("Ap", "May")
    addionalMonths.addAll(newMonths)
    //bu sekilde de ekleyebiliriz
    addionalMonths.add("Jun")
    println(addionalMonths) //Jan Feb Ap May Jun

    //array listi direk mutable olarakta yazabiliriz
    val days = mutableListOf<String>("Mon","Tue")
    days.add("Wed")
    println(days)// Mon,Tue,Wed
    days[1] = "Sun" //1.indexi Sun olarak degistirecektir
    days.removeAt(1)
  //  days.removeAll(days)


}