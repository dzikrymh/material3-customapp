package com.example.customapplication.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.customapplication.ui.dashboard.pagers.example1.Example1Fragment
import com.example.customapplication.ui.dashboard.pagers.example2.Example2Fragment

private val TAB_TITLES = arrayOf(
    "Example 1",
    "Example 2"
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return if (position == 0) {
            Example1Fragment.newInstance()
        } else {
            Example2Fragment.newInstance()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return TAB_TITLES[position]
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return 2
    }
}