package com.crix.myapplication12

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.crix.myapplication12.databinding.FragmentDetailBinding
import com.crix.myapplication12.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mainActivity = activity as MainActivity
        binding.rvBeispiel.adapter = BeispielAdapter(mainActivity.datasource)

        binding.tvHomeTitle.setOnClickListener {
            Log.e("Content", mainActivity.datasource.toString())
        }
    }

}