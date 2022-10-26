package com.example.tipcalculate

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculateTip: ViewModel() {
    var costOfService = MutableLiveData("")
    var Display = MutableLiveData("")

    fun calculateData()
    {
        var GetCost = costOfService.value?.toInt()
        var Percentage = GetCost?.times(0.15).toString()
        Display.value = Percentage
    }
}