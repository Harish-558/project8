package com.example.projectharish9

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        
        view.findViewById<Button>(R.id.btn_go_profile).setOnClickListener {
            // Safe Args isn't fully set up with generated classes right now, we can use ID navigation with args bundle
            val args = Bundle().apply { putString("userId", "user_12345") }
            findNavController().navigate(R.id.action_home_to_profile, args)
        }
        
        view.findViewById<Button>(R.id.btn_go_login).setOnClickListener {
            findNavController().navigate(R.id.action_home_to_auth_graph)
        }
        
        return view
    }
}
