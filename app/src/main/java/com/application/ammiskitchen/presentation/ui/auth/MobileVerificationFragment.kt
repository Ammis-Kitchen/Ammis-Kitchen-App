package com.application.ammiskitchen.presentation.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.application.ammiskitchen.R
import com.application.ammiskitchen.databinding.FragmentLoginBinding
import com.application.ammiskitchen.databinding.FragmentMobileVerificationBinding

class MobileVerificationFragment : Fragment() {

    private var _binding: FragmentMobileVerificationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        context?.theme?.applyStyle(R.style.AppTheme, true)
        _binding = FragmentMobileVerificationBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonVerify.setOnClickListener {
            findNavController().navigate(R.id.action_mobileVerificationFragment_to_mainFeedFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}