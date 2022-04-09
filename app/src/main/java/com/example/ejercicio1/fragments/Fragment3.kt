package com.example.ejercicio1.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ejercicio1.R
import com.example.ejercicio1.adapter.ProfesionalesAdapter
import com.example.ejercicio1.viewmodels.Fragment3ViewModel

class Fragment3 : Fragment() {

    private lateinit var viewModel: Fragment3ViewModel

    private lateinit var v: View
    private lateinit var text : TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.fragment3_fragment, container, false)
        return v
    }

    override fun onStart() {
        super.onStart()
        val pName = Fragment3Args.fromBundle(requireArguments()).nombreProfesional + Fragment3Args.fromBundle(requireArguments()).apellidoProfesional
        text = v.findViewById(R.id.fullname)
        text.setText(pName)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Fragment3ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}