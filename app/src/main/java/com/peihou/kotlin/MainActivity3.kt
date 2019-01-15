package com.peihou.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.MotionEvent
import android.view.View
import android.widget.AdapterView
import butterknife.ButterKnife
import com.peihou.kotlin.adapter.CountSectionAdapter
import com.truizlop.sectionedrecyclerview.SectionedSpanSizeLookup
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        ButterKnife.bind(this)
        setUpRecycler()
    }
    fun setUpRecycler(){
        var group=ArrayList<Int>()
        group.add(1)
        group.add(2)
        group.add(3)

        var childs=mutableListOf<MutableList<Int>>()
        var child11=ArrayList<Int>()
        child11.add(11)
        child11.add(12)
        child11.add(13)


        var child22=ArrayList<Int>()
        child22.add(22)
        child22.add(23)
        child22.add(24)
        child22.add(25)



        var child33=ArrayList<Int>()
        child33.add(33)
        child33.add(34)
        child33.add(35)
        child33.add(36)
        child33.add(37)


        childs.add(child11)
        childs.add(child22)
        childs.add(child33)

        var adapter=CountSectionAdapter(this,group,childs)
        recycler.adapter=adapter
        var layoutManager= GridLayoutManager(this,2)
        var lookup= SectionedSpanSizeLookup(adapter,layoutManager)
        layoutManager.spanSizeLookup=lookup
        recycler.layoutManager=layoutManager
        recycler.setOnClickListener() {  }

//        recycler.addOnItemTouchListener(object :OnRecyclerItemClickListener {
//
//        })

    }
}

