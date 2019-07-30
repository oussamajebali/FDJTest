package com.fdj.fdjtest.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.fdj.fdjtest.model.Response
import com.fdj.fdjtest.retrofit.RetrofitService

/**
 * Created by Oussama on 29/07/2019.
 */
class ResponseViewModel : ViewModel() {

    private val retrofitService  = RetrofitService()

    fun getResponseData(query : String) : MutableLiveData<Response>? {
        return retrofitService.loadResponseData(query)
    }

}