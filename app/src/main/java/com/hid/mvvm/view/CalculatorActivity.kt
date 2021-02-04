package com.hid.mvvm.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.hid.mvvm.R
import com.hid.mvvm.databinding.ActivityCalculatorBinding
import com.hid.mvvm.viewmodel.CalculatorViewModel

class CalculatorActivity : AppCompatActivity()   {

    lateinit var binding: ActivityCalculatorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_calculator)
        binding.lifecycleOwner = this
        binding.vm = ViewModelProviders.of(this).get(CalculatorViewModel::class.java)

        setSupportActionBar(binding.toolbar)

    }

    override fun onDestroy() {
        super.onDestroy()
    }


}
