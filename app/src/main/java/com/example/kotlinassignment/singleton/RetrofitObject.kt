package com.example.kotlinassignment.singleton

import com.example.kotlinassignment.interfaces.RetrofitServiceInterface
import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitObject {
    var retrofitInstance: Retrofit
    const val BASE_URL = "https://dl.dropboxusercontent.com/"

    init {
            retrofitInstance = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
    }
    fun getApi() = retrofitInstance.create(RetrofitServiceInterface::class.java)

}