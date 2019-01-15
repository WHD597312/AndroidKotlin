package com.peihou.kotlin.step5

class Student(name:String,age:Int, var no:String,var score:Int) :Person(name,age) {

}
fun main(args:Array<String>){
    var s=Student("王海东",25,"20131090149",60)
    println("学生：${s.name}")
    println("年龄：${s.age}")
    println("学号：${s.no}")
    println("成绩：${s.score}")
    var sss1:Boolean=false

}