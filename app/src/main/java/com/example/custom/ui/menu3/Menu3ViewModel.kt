package com.example.custom.ui.menu3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Menu3ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is menu3 Fragment"
    }
    val text: LiveData<String> = _text
}