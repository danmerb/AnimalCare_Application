package com.dans.animalcare.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager.widget.ViewPager
import com.dans.animalcare.R
import com.dans.animalcare.fragments.Fragment1
import com.dans.animalcare.fragments.*

class Main2Activity : AppCompatActivity() {

    var pagerAdapter: SlideAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_slide)
        pagerAdapter = SlideAdapter(supportFragmentManager)
        pagerAdapter!!.addFragments(fragment_logo())
        pagerAdapter!!.addFragments(Fragment1())
        pagerAdapter!!.addFragments(Fragment2())
        pagerAdapter!!.addFragments(Fragment3())
        pagerAdapter!!.addFragments(Fragment4())
        pagerAdapter!!.addFragments(Fragment5())
        pagerAdapter!!.addFragments(Fragment6())


        val pager = findViewById<View>(R.id.vp_main) as ViewPager

        pager.adapter = pagerAdapter
    }
}