package com.fdj.fdjtest.retrofit

import android.arch.lifecycle.MutableLiveData
import android.util.Log
import com.fdj.fdjtest.model.Response
import com.google.gson.GsonBuilder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Oussama on 29/07/2019.
 */
class RetrofitService {

    val liveResponse: MutableLiveData<Response> = MutableLiveData()

    companion object Factory {
        var gson = GsonBuilder().setLenient().create()
        fun create(): ApiInterface {

            val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl("https://api.unsplash.com/search/")
                .build()

            return retrofit.create(ApiInterface::class.java)
        }
    }

    fun loadResponseData(query : String): MutableLiveData<Response>? {

        val retrofitCall  = create().getResponse(query)

        retrofitCall.enqueue(object : Callback<Response> {
            override fun onFailure(call: Call<Response>, t: Throwable?) {
                Log.e("on Failure :", "retrofit error")
            }

            override fun onResponse(call: Call<Response>, response: retrofit2.Response<Response>) {
                liveResponse.value = response.body()

            }

        })

        return liveResponse
    }
}