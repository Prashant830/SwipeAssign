package com.prashant830.swipeassign.network

import com.prashant830.swipeassign.network.sevices.SendProductApi
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiManagement {

    var okHttp: OkHttpClient? = null
    private val BASE_URL = "https://app.getswipe.in/api/public/"

    fun getRetrofit() : Retrofit?{
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = (HttpLoggingInterceptor.Level.BODY)
        okHttp = OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build()

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttp)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }


    // api declarations...
    val sendProductApi = getRetrofit()
        ?.create(SendProductApi::class.java)


}