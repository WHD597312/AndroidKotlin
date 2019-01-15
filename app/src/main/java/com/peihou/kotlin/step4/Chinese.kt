package com.peihou.kotlin.step4

class Chinese :Language(){
    override var name: String?=null
//        get() {
//            if (field==null || field=="")
//                return null
//            else
//                return field
//        }
          set(value) {}

    override fun init() {
        println("初始化变量")
    }
}