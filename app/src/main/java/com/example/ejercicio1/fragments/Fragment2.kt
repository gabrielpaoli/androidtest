package com.example.ejercicio1.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ejercicio1.R
import com.example.ejercicio1.adapter.ProfesionalesAdapter
import com.example.ejercicio1.entities.ProfesionalRepository
import com.example.ejercicio1.viewmodels.Fragment2ViewModel

class Fragment2 : Fragment() {

    private lateinit var viewModel: Fragment2ViewModel

    private lateinit var v: View
    private lateinit var welcomeText : TextView
    private lateinit var recProfesional : RecyclerView
    private var repository = ProfesionalRepository()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.fragment2_fragment, container, false)
        recProfesional = v.findViewById(R.id.recProfesional)
        return v
    }

    override fun onStart() {
        super.onStart()
        var saludo = "Bienvenido " + Fragment2Args.fromBundle(requireArguments()).nombreUsuario
        welcomeText = v.findViewById(R.id.welcomeText)
        welcomeText.setText(saludo)

        recProfesional.setHasFixedSize(true)
        recProfesional.layoutManager  = LinearLayoutManager(context)

        recProfesional.adapter = ProfesionalesAdapter(repository.getProfesionales()){ index ->
            onItemClick(index)
        }


    }

    private fun onItemClick(index: Int) {
        Log.d("TAG", "message")
        val action = Fragment2Directions.actionFragment2ToFragment3("SASA", "SUSU")
        v.findNavController().navigate(action)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Fragment2ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}