package com.example.ejercicio1.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.findNavController
import com.example.ejercicio1.R
import com.example.ejercicio1.entities.User
import com.example.ejercicio1.viewmodels.Fragment1ViewModel
import com.google.android.material.snackbar.Snackbar

class Fragment1 : Fragment() {

    private lateinit var viewModel: Fragment1ViewModel

    private lateinit var v: View
    private lateinit var btnNavigate : Button
    private lateinit var loginMail : EditText
    private lateinit var loginPass : EditText

    lateinit var emailText: String
    lateinit var loginPassText: String
    lateinit var userName: String

    var userList = mutableListOf<User>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.fragment1_fragment, container, false)
        btnNavigate = v.findViewById(R.id.btnNavigate)
        return v
    }

    override fun onStart() {
        super.onStart()
        userList.add(User("Gabriel1", "Paoli1", "gabrielpaoli1@hotmail.com", "1"));
        userList.add(User("Gabriel2", "Paoli2", "gabrielpaoli2@hotmail.com", "12"));
        userList.add(User("Gabriel3", "Paoli3", "gabrielpaoli3@hotmail.com", "123"));
        userList.add(User("Gabriel4", "Paoli4", "gabrielpaoli4@hotmail.com", "1234"));

        loginMail = v.findViewById(R.id.loginMail)
        loginPass = v.findViewById(R.id.loginPass)

        btnNavigate.setOnClickListener{
            emailText = loginMail.text.toString()
            loginPassText = loginPass.text.toString()
            userName = ""

            for (user in userList) {
                if(user.email == emailText && user.password == loginPassText){
                    userName = user.firstName
                    break
                }
            }

            if(userName.isEmpty()){
                Snackbar.make(v, "Usuario no encontrado", Snackbar.LENGTH_SHORT).show()
            }else{
                val action = Fragment1Directions.actionFragment1ToFragment2(userName)
                v.findNavController().navigate(action)
            }

        }
    }

    private fun searchUser(): String {
        return "HOOLAA"
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Fragment1ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}