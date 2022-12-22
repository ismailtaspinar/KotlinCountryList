package com.ismail.kotlincountrylist.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ismail.kotlincountrylist.model.Country

class FeedViewModel : ViewModel() {
    val countries = MutableLiveData<List<Country>>()
    val countryError = MutableLiveData<Boolean>()
    val countryLoading = MutableLiveData<Boolean>()

    fun refreshData() {
        val country = Country("Turkey","Ankara","Asia","Turkish","TRY","www.ss.com")
        val country2 = Country("France","Paris","Europe","French","EUR","www.ss.com")
        val country3 = Country("Germany","Berlin","Europe","German","EUR","www.ss.com")

        val countryList = arrayListOf<Country>(country,country2,country3)

        countries.value = countryList
        countryError.value = false
        countryLoading.value = false

    }
}