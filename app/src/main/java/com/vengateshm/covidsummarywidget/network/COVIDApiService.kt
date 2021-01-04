package com.vengateshm.covidsummarywidget.network

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object COVIDApiService {
    private lateinit var retrofit: Retrofit

    init {
        retrofit = Retrofit.Builder()
            .baseUrl("https://api.covid19api.com/")
            .addConverterFactory(
                GsonConverterFactory.create(
                    GsonBuilder().setPrettyPrinting().create()
                )
            )
            .build()
    }

    fun getCOVIDApi(): COVIDApi {
        return retrofit.create(COVIDApi::class.java)
    }
}