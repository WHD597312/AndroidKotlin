package com.peihou.kotlin.database.daoimpl

import android.content.Context
import com.peihou.kotlin.application.MyApplicaion
import com.peihou.kotlin.database.*
import com.peihou.kotlin.pojo.Student
import org.greenrobot.greendao.query.WhereCondition

class StudentDaoImpl {

    var master: DaoMaster
    var session: DaoSession
    var studentDao: StudentDao

    constructor(context: Context){
        var db = DBManager2.getWritabledatabase(context)
        master = DaoMaster(db)
        session = master.newSession()
        studentDao = session.studentDao
    }


    fun insert(student: Student): Boolean {
        var n: Long = studentDao.insert(student)
        return n > 0
    }

    fun update(student: Student) {
        studentDao.update(student!!)
    }

    fun delete(student: Student) {
        studentDao.delete(student)
    }

    fun findStudentById(id: Long): Student {
        return studentDao.load(id)
    }

    fun findStudntById2(id: Long): Student {
        return studentDao.queryBuilder().where(StudentDao.Properties.Id.eq(id)).unique()
    }

    fun findAllStudent(): List<Student> {
        return studentDao.loadAll()
    }

    fun findStudentByIdAndName(id: Long, username: String): Student {
        var where: WhereCondition = studentDao.queryBuilder().and(StudentDao.Properties.Id.eq(id), StudentDao.Properties.Username.eq(username))
        return studentDao.queryBuilder().where(where).unique()
    }
}