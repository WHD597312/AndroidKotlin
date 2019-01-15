package com.peihou.kotlin.step4

fun main(args:Array<String>){
    var child=Child()
    child.bar()
    child.foo()

    var stu:Student= Student()
    stu.name="wang"
    println("lastName:${stu.name}")
    stu.no=9
    println("no:${stu.no}")
    stu.classTeacher=null
    println(stu.classTeacher)
    println(stu.isKZ)
    stu.className="一年一班"
    println(stu.className)
    println("test:${stu.test}")

    var l=Chinese()
    l.init()
}