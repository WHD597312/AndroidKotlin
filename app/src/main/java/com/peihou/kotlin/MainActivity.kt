package com.peihou.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick
import butterknife.Unbinder
import com.peihou.kotlin.database.daoimpl.StudentDaoImpl
import com.peihou.kotlin.pojo.Student
import com.peihou.kotlin.view.RoundProgressBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var unbinder: Unbinder? = null
    var student: Student
    var studentDao: StudentDaoImpl?=null

    init {
        student = Student()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        unbinder = ButterKnife.bind(this)
        roundProgress.progress = 30
        student.username = "王海东"
        student.age = 25
        studentDao = StudentDaoImpl(applicationContext)
        var success = studentDao!!.insert(student)
        Log.i("sssss", "-->" + success)
    }

    companion object {
        var running: Boolean = false
    }

    override fun onStart() {
        super.onStart()
        running = true
    }

    override fun onDestroy() {
        super.onDestroy()
        unbinder!!.unbind()
    }
}
