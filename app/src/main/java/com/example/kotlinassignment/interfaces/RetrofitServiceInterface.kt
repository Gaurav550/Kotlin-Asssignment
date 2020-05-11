package com.example.kotlinassignment.interfaces

import com.example.kotlinassignment.models.Items
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface RetrofitServiceInterface {

    @GET("s/2iodh4vg0eortkl/facts.json")
    fun getData(): Call<Items>

}