package com.example.curse.ui.luck

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.curse.R
import com.example.curse.databinding.FragmentHoroscopeBinding
import com.example.curse.databinding.FragmentLuckBinding

class LuckFragment : Fragment() {
    private var _bilding: FragmentLuckBinding? = null
    private val binding get() = _bilding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _bilding = FragmentLuckBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}