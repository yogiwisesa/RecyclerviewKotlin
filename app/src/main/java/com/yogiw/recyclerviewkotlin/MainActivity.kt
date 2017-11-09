package com.yogiw.recyclerviewkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var listJob: ArrayList<JobClass> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupDummy()
        val adapter = JobAdapter(this, listJob)
        rvJob.adapter = adapter
        rvJob.layoutManager = LinearLayoutManager(this)


    }

    // add dummy item to listJob
    fun setupDummy(){
        listJob.add(JobClass("Budi","Software Engineer"))
        listJob.add(JobClass("Joko","Project Leader"))
        listJob.add(JobClass("Rimba","UI UX Designer"))
        listJob.add(JobClass("Said","Backend Programmer"))
    }


}
