package com.example.projectharish9

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class ProfileFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)
        
        // Receive arguments
        val userId = arguments?.getString("userId") ?: "Unknown User"
        view.findViewById<TextView>(R.id.tv_profile_info).text = "Profile for: \$userId"
        
        return view
    }
}
