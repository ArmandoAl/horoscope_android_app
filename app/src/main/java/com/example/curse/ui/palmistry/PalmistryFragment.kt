package com.example.curse.ui.palmistry

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.example.curse.R
import com.example.curse.databinding.FragmentHoroscopeBinding
import com.example.curse.databinding.FragmentPalmistryBinding

class PalmistryFragment : Fragment() {
    private var _bilding: FragmentPalmistryBinding? = null
    private val binding get() = _bilding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _bilding = FragmentPalmistryBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}