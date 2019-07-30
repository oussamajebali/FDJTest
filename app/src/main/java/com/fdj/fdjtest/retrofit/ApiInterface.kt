package com.fdj.fdjtest.retrofit

import com.fdj.fdjtest.model.Response
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Oussama on 29/07/2019.
 */
interface ApiInterface {

    @GET("photos?client_id=a76ebbad189e7f2ae725980590e4c520a525e1db029aa4cea87b44383c8a1ec4")
    fun getResponse(@Query("query") query: String): Call<Response>
}