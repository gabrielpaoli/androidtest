package com.example.ejercicio1.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ejercicio1.R
import com.example.ejercicio1.viewmodels.Fragment3ViewModel

class Fragment3 : Fragment() {

    companion object {
        fun newInstance() = Fragment3()
    }

    private lateinit var viewModel: Fragment3ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment3_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Fragment3ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}