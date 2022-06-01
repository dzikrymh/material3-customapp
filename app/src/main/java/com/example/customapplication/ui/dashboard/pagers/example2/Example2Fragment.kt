package com.example.customapplication.ui.dashboard.pagers.example2

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.customapplication.R

class Example2Fragment : Fragment() {

    companion object {
        fun newInstance() = Example2Fragment()
    }

    private lateinit var viewModel: Example2ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_example2, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Example2ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}