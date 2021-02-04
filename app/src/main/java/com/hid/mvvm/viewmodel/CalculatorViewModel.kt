package com.hid.mvvm.viewmodel

import android.app.Application
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.hid.mvvm.R
import com.hid.mvvm.model.Calculator
import com.hid.mvvm.model.Calculation

class CalculatorViewModel @JvmOverloads constructor (
        app: Application, private val calculator: Calculator = Calculator()) : ObservableViewModel(app) {

    private var lastCalculated = Calculation()

    var input1 = ""
    var input2 = ""

   val outputAmount: String get() = getApplication<Application>().getString(R.string.output_value, lastCalculated.grandTotal)

    init {
        updateOutputs(Calculation())
    }

    private fun updateOutputs(tc: Calculation) {
        lastCalculated = tc

        notifyChange()
    }

    fun calculateAdd() {
        val input1 = input1.toDoubleOrNull()
        val input2 = input2.toDoubleOrNull()

        if (input1 != null && input2 != null) {
            updateOutputs(calculator.calculateAdd(input1, input2))
        }
    }

    fun calculateMinus() {
        val input1 = input1.toDoubleOrNull()
        val input2 = input2.toDoubleOrNull()

        if (input1 != null && input2 != null) {
            updateOutputs(calculator.calculateMinus(input1, input2))
        }else if(input1 == null){

        }
    }

    fun calculateMultiply() {
        val input1 = input1.toDoubleOrNull()
        val input2 = input2.toDoubleOrNull()

        if (input1 != null && input2 != null) {
            updateOutputs(calculator.calculateMultiply(input1, input2))
        }
    }


    fun calculateDivide() {
        val input1 = input1.toDoubleOrNull()
        val input2 = input2.toDoubleOrNull()

        if (input1 != null && input2 != null) {
            updateOutputs(calculator.calculateDivide(input1, input2))
        }
    }

}

