package com.peihou.kotlin.step2


fun main(args:Array<String>){
    var a=3
    var b=4
    var c=if (a>b) a else b
    println(c)
    var x=5;
    if (x in 1..8){
        println("x变量在1到8范围内")
    }
    when(x){
        1 -> println("sssss")
        5 -> println("sssss2")
        3 -> println("sssss3")
        else->
            println("ssssssssss4")
    }

    var arr:IntArray= intArrayOf(1,2,3,4)
    var arr2=Array(10,{i: Int -> (i*2) })
    for(i in arr2.indices){
        if(i==2)
            continue
        if (i==6)
            break
        println(arr2[i])
    }

}