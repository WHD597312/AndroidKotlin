package com.peihou.kotlin.step4

/**
 * 在kotlin中，在set和get方法中是不允许有本身的局部变量的，
 * 因为属性涉及到了set/get会造成递归调用，所以要解决引用自身的问题
 * kotlin发明了field来解决这个问题
 */
class Student {

    var name:String?="zhang"
             get() = field!!.toUpperCase()
    var no:Int=0
       get() {
           if (field==0){
               field=1
           }else{
               field=2
           }
           return field
       }
        set(value) {
            if (value<10){
                field=value
            }else{
                field=-1
            }
        }
    var classTeacher:String?="孔子"
        set(value) =
            if (value==null){
                field="孔圣人"
            }else{
                field=value
            }
    var isKZ:Boolean=true
            get() {
                return this.classTeacher=="孔圣人"
            }
    var className:String?="1班"
    var test : Int = 0
        get() {
            field=1
            return field
        }

    constructor()
    constructor(name:String){
        this.name=name
    }
}