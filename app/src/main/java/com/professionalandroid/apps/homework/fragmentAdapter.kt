package com.professionalandroid.apps.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

//프레그먼트를 결합
class fragmentAdapter(fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager) {
   private val fragments : ArrayList<Fragment> = ArrayList()
    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }

    override fun getCount(): Int {
       return fragments.size
    }

    fun addItems(item: Fragment){
        fragments.add(item)
    }
}