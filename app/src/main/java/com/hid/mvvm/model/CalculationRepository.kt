package com.hid.mvvm.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class CalculationRepository {

    private val savedCalculation = mutableMapOf<String, Calculation>()

    fun loadSavedCalculations(): LiveData<List<Calculation>> {
        val liveData = MutableLiveData<List<Calculation>>()
        liveData.value = savedCalculation.values.toList()
        return liveData
    }
}
