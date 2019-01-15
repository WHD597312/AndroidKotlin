package com.peihou.kotlin.step4

class Child:MyInterface {
    override var name: String
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
        set(value) {}

    override fun bar() {
        println("bar")
    }

}