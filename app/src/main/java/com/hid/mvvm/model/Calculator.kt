package com.hid.mvvm.model

import androidx.lifecycle.LiveData
import java.math.RoundingMode

class Calculator( ) {
    fun calculateAdd(input1: Double,input2: Double): Calculation {

        val totalGrand = (input1 * (input2.toDouble() / 100.0f))
                .toBigDecimal()
                .setScale(2, RoundingMode.HALF_UP)
                .toDouble()

        val grandTotal = input1 + input2
        return Calculation(input1 = input1,  input2 = input2, grandTotal = grandTotal)
    }
    fun calculateMinus(input1: Double,input2: Double): Calculation {

        val totalGrand = (input1 * (input2.toDouble() / 100.0f))
                .toBigDecimal()
                .setScale(2, RoundingMode.HALF_UP)
                .toDouble()

        val grandTotal = input1 - input2
        return Calculation(input1 = input1,  input2 = input2, grandTotal = grandTotal)
    }
    fun calculateMultiply(input1: Double,input2: Double): Calculation {

        val totalGrand = (input1 * (input2.toDouble() / 100.0f))
                .toBigDecimal()
                .setScale(2, RoundingMode.HALF_UP)
                .toDouble()

        val grandTotal = input1 * input2
        return Calculation(input1 = input1,  input2 = input2, grandTotal = grandTotal)
    }
    fun calculateDivide(input1: Double,input2: Double): Calculation {

        val totalGrand = (input1 * (input2.toDouble() / 100.0f))
                .toBigDecimal()
                .setScale(2, RoundingMode.HALF_UP)
                .toDouble()

        val grandTotal = input1 / input2
        return Calculation(input1 = input1,  input2 = input2, grandTotal = grandTotal)
    }

}
