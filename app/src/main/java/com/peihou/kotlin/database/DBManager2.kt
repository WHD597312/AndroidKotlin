package com.peihou.kotlin.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import com.peihou.kotlin.application.MyApplicaion

class DBManager2 {
    companion object {
        var openHelper:DaoMaster.DevOpenHelper?=null
        private var name="kotlin"
        fun getWritabledatabase(context: Context):SQLiteDatabase{
            if (openHelper==null){
                synchronized(DBManager2.javaClass){
                    openHelper=DaoMaster.DevOpenHelper(context, name,null)
                }
            }
            return openHelper!!.writableDatabase
        }
    }

}