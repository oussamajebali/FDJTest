package com.fdj.fdjtest.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Oussama on 29/07/2019.
 */
data class Response(
    @SerializedName("results") val results: List<Urls>
)

data class Urls(
    @SerializedName("description") val description: String,
    @SerializedName("urls") val urls: Image
)

data class Image(
    @SerializedName("thumb") val image: String
)