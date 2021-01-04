package com.vengateshm.covidsummarywidget.network

import com.vengateshm.covidsummarywidget.models.SummaryResponse
import retrofit2.Call
import retrofit2.http.GET

interface COVIDApi {
    @GET("summary")
    fun getSummary(): Call<SummaryResponse>
}