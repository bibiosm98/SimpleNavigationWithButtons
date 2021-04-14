package com.example.simplenavigationwithbutton.ui.thirdview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.simplenavigationwithbutton.R
import com.example.simplenavigationwithbutton.databinding.ThirdFragmentBinding

class ThirdFragment : Fragment() {

    companion object {
        fun newInstance() = ThirdFragment()
    }

    private lateinit var viewModel: ThirdViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                                savedInstanceState: Bundle?): View? {
        val binding: ThirdFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.third_fragment, container, false)

        binding.toHomeButton.setOnClickListener {
            findNavController().navigate(ThirdFragmentDirections.actionThirdFragmentToHomeFragment())
        }
        binding.toSecondButton.setOnClickListener {
            findNavController().navigate(ThirdFragmentDirections.actionThirdFragmentToSecondFragment())
        }

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ThirdViewModel::class.java)
        // TODO: Use the ViewModel
    }

}