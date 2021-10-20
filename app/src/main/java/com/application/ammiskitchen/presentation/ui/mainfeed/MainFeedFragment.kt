package com.application.ammiskitchen.presentation.ui.mainfeed

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.application.ammiskitchen.R
import com.application.ammiskitchen.databinding.FragmentMainFeedBinding
import com.application.ammiskitchen.databinding.FragmentMobileVerificationBinding

class MainFeedFragment : Fragment() {

    private var _binding: FragmentMainFeedBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        context?.theme?.applyStyle(R.style.AppTheme, true)
        _binding = FragmentMainFeedBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}