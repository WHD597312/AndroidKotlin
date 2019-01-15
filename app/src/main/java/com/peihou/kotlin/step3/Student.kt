package com.peihou.kotlin.step3

class Student{
    var name :String?=null
                get() = field
                set

    var age:Int=0

    init {
        println("name=$name")
    }

    constructor()
    constructor(name: String){
        println("name=$name")
        this.name=name;
    }
    constructor(name:String,age:Int):this(name){
        this.age=age;
    }

    override fun toString(): String {
        return "Student(name=$name, age=$age)"
    }

}