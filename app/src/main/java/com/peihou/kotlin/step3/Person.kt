package com.peihou.kotlin.step3

open class Person {
    protected var name:String?=null;
    protected var age=0;
    constructor()
    constructor(name:String,age:Int){
        this.name=name;
        this.age=age;
    }
}