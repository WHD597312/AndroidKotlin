package com.peihou.kotlin.step3

fun main(args:Array<String>){
    var s=Student();
    s.name="王海东"
    s.age=25
    println(s)
    var ss=Student("whd",24)
    println(ss)
}