package com.professionalandroid.apps.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var item = ArrayList<data>()

        for(i in 0 until 10){
            val sampledata = data(""+i)
            item.add(sampledata)
        }
        val adapter = ReCycle(item, LayoutInflater.from(this))
        recycle.adapter = adapter
        recycle.layoutManager = LinearLayoutManager(this)

    }
}
class data
    (val title1 : String ?= null)
{

}

class ReCycle(
    val itemList : ArrayList<data>,
    val inflater : LayoutInflater
) : RecyclerView.Adapter<ReCycle.ViewHolder>(){
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title1 = view.findViewById<TextView>(R.id.text_insert)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReCycle.ViewHolder {
       return ViewHolder((inflater.inflate(R.layout.activity_main2recycle,parent,false)))
    }

    override fun getItemCount(): Int {
       return itemList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title1.setText(itemList[position].title1)
    }
}