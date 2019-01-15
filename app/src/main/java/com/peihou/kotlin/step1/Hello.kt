package com.peihou.kotlin.step1

fun main(args:Array<String>){


    //kotlin在定义变量时，可以不声明变量的类型，编译器会自动判断
    var  a:Int=1
    var b=1

    //不可更改的变量，即只能赋值一次的变量
    val c=2


    var s1="a is $a"
    a=2
    var s2="${s1.replace("is","was")},now is $a"
    println(s2)

    //类型后面加？，表示可为空
    var age:String?=null;
    var ages=age?.toInt()
    println("ages=${ages}")

    var  agrs2=age?.toInt()?:-1
    println(agrs2)

    printSum(a, b)

    println("--------------------------")
    vars(1,2,3,4,5)
    println("--------------------------")

    for (i in 1..4)
        println(i)
    println("--------------------------")
    for (i in 1..4 step 2)
        println(i)
    println("--------------------------")
    for (i in 4 downTo 1 step 2)
        println(i)
    println("--------------------------")
    for (i in 1 until 10)
        println(i)
}
//函数定义使用关键字fun，参数格式为：参数:类型
fun sum(a:Int,b:Int):Int{
    return a+b
}
//无返回值得函数
fun printSum(a: Int,b:Int){
    println(a+b)
}
//函数的可变长参数可以用vararg关键字进行标识
fun vars(vararg v:Int){
    for (vt in v){
        println(vt)
    }
}