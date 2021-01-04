package com.vengateshm.covidsummarywidget.models

import com.google.gson.annotations.SerializedName

data class SummaryResponse(
    @SerializedName("Message") val message: String,
    @SerializedName("Global") val global: Global,
    @SerializedName("Countries") val countries: List<Countries>,
    @SerializedName("Date") val date: String
)