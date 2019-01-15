package com.peihou.kotlin.step3

class Teacher:Person {
    var teach:String?=null
    constructor():super()
    constructor(name:String,age:Int,teach:String):super(name,age){
        this.teach=teach;
    }
}