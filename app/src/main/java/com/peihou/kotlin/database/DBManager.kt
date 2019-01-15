package com.peihou.kotlin.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase

class DBManager {
    private var context:Context
    private var name:String="kotlin"
    private var openHelper:DaoMaster.DevOpenHelper
    private  constructor(context: Context){
        this.context=context;
        openHelper=DaoMaster.DevOpenHelper(context,name,null)
    }
    companion object {
        private var instance: DBManager?=null
        fun getInstance(context: Context): DBManager?{
            if (instance ==null){
                synchronized(DBManager::class.java){
                    if (instance ==null){
                        instance = DBManager(context)
                    }
                }
            }
            return instance;
        }
    }
    private var instance:DBManager?=null
                get() {
                    if (field==null){
                        synchronized(DBManager::class.java){
                            if (field==null)
                                field= DBManager(context)
                        }
                    }
                    return field
                }
    fun getWritableDatabase():SQLiteDatabase{
        if (openHelper==null)
            openHelper= DaoMaster.DevOpenHelper(context,name,null)
       return openHelper.writableDatabase
    }
    fun getReadableDatabase():SQLiteDatabase{
        if (openHelper==null)
            openHelper=DaoMaster.DevOpenHelper(context,name,null)
        return openHelper.readableDatabase
    }
}