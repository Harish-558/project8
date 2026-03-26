package com.example.projectharish9

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false)
        
        view.findViewById<Button>(R.id.btn_login).setOnClickListener {
            // After successful login, pop back to home
            findNavController().popBackStack(R.id.homeFragment, false)
        }
        
        return view
    }
}
