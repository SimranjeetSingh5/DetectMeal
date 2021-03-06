package com.project.detectmeal.onboarding

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.project.detectmeal.R

class SplashScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Handler().postDelayed({
            if (restorePref(requireContext())) {
                findNavController().navigate(R.id.action_splashScreen_to_detectFragment)
            } else {
                findNavController().navigate(R.id.action_splashScreen_to_viewPagerFragment)
            }

        }, 1000)
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_splash_screen, container, false)

        return view
    }

}