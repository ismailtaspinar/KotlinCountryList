package com.ismail.kotlincountrylist.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ismail.kotlincountrylist.model.Country

class CountryViewModel : ViewModel() {
    val countryLiveData = MutableLiveData<Country>()

    fun getDataFromRoom(){
        val country = Country("Turkey","Ankara","Asia","Turkish","TRY","www.ss.com")
        countryLiveData.value = country
    }
}