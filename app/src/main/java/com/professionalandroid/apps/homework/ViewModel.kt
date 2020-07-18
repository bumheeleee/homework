package com.professionalandroid.apps.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main2.*

class ViewModel : AppCompatActivity() {

    val viewModel : My_ViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_model)

        viewModel.mydata() // My_ViewModel-> viewModel로 바꿔줘서 mydata함수 가져옴

        //        for (i in 0 until 10) {
        //            val sampledata = sample6data("" + i, "" + i)
        //            item.add(sampledata)
        //사용할 필요가 없음

        val adapter = ReCycle(viewModel.item , LayoutInflater.from(this) )
        recycle.adapter = adapter
        recycle.layoutManager = LinearLayoutManager(this)
        viewModel.liveData.observe(this , Observer {

        })


    }
}