package com.example.simplenavigationwithbutton.ui.secondview

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.simplenavigationwithbutton.R
import com.example.simplenavigationwithbutton.databinding.SecondFragmentBinding

class SecondFragment : Fragment() {

    companion object {
        fun newInstance() = SecondFragment()
    }

    private lateinit var viewModel: SecondViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                                savedInstanceState: Bundle?): View? {

        val binding: SecondFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.second_fragment, container, false)

        binding.toHomeButton.setOnClickListener {
            findNavController().navigate(SecondFragmentDirections.actionSecondFragmentToHomeFragment())
        }

        binding.toThirdButton.setOnClickListener {
            findNavController().navigate(SecondFragmentDirections.actionSecondFragmentToThirdFragment())
        }

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SecondViewModel::class.java)
        // TODO: Use the ViewModel
    }

}