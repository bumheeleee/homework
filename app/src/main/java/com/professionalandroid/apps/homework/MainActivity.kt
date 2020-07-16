package com.professionalandroid.apps.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import kotlinx.android.synthetic.main.activity_custom_tab.view.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentone = fragment1()
        val fragmentwo = fragment2()
        val fragmenthree = fragment3()

        val adapt = fragmentAdapter(supportFragmentManager)

        adapt.addItems(fragmentone)
        adapt.addItems(fragmentwo)
        adapt.addItems(fragmenthree)

        ViewPager_view.adapter = adapt
        TabLayout_tab.setupWithViewPager(ViewPager_view)
        TabLayout_tab.getTabAt(0)?.setCustomView(createView("홈"))
        TabLayout_tab.getTabAt(1)?.setCustomView(createView("정보"))
        TabLayout_tab.getTabAt(2)?.setCustomView(createView("취소"))


    }

    fun createView(tabName : String) : View
    {
        val tabView = LayoutInflater.from(this).inflate(R.layout.activity_custom_tab,null)
        tabView.TextView_text.text = tabName
        when(tabName){
            "홈" ->{
                tabView.ImageView_image.setImageResource(R.drawable.ic_baseline_home_24)
            }
            "정보" ->{
                tabView.ImageView_image.setImageResource(R.drawable.ic_baseline_information_circle_24)
            }
            "취소" ->{
                tabView.ImageView_image.setImageResource(R.drawable.ic_baseline_check_24)
            }
            else ->{
                return tabView
            }
        }
        return tabView
    }

}

