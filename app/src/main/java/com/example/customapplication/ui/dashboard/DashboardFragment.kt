package com.example.customapplication.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.ViewPager
import com.example.customapplication.MainActivity
import com.example.customapplication.adapter.SectionsPagerAdapter
import com.example.customapplication.databinding.FragmentDashboardBinding
import com.google.android.material.tabs.TabLayout

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root
        MainActivity.animate(false)

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val sectionsPagerAdapter = SectionsPagerAdapter(requireActivity(), requireActivity().supportFragmentManager)
        binding.pagers.apply {
            adapter = sectionsPagerAdapter
            binding.tabs.setupWithViewPager(this)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding.pagers.adapter = null
        _binding = null
    }
}