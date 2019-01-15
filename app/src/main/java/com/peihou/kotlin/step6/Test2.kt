package com.peihou.kotlin.step6

fun main(args:Array<String>){
    var test=Test()
    test.setInterface(object:TestInteface{
        override fun test(){

        }
    })
}