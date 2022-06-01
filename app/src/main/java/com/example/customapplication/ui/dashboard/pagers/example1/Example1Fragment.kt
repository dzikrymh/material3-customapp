package com.example.customapplication.ui.dashboard.pagers.example1

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.customapplication.R

class Example1Fragment : Fragment() {

    companion object {
        fun newInstance() = Example1Fragment()
    }

    private lateinit var viewModel: Example1ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_example1, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Example1ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}