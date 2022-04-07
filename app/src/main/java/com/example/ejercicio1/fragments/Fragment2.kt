package com.example.ejercicio1.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.findNavController
import com.example.ejercicio1.R
import com.example.ejercicio1.User
import com.example.ejercicio1.viewmodels.Fragment2ViewModel

class Fragment2 : Fragment() {

    private lateinit var viewModel: Fragment2ViewModel

    private lateinit var v: View
    private lateinit var welcomeText : TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.fragment2_fragment, container, false)
        return v
    }

    override fun onStart() {
        super.onStart()
        var userName = Fragment2Args.fromBundle(requireArguments()).nombreUsuario
        welcomeText = v.findViewById(R.id.welcomeText)
        welcomeText.setText(userName)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Fragment2ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}