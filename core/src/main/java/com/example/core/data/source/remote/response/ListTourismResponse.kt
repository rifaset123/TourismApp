package com.example.core.data.source.remote.response

import com.google.gson.annotations.SerializedName

// API : https://tourism-api.dicoding.dev/list
data class ListTourismResponse(

    @field:SerializedName("error")
    val error: Boolean,

    @field:SerializedName("message")
    val message: String,

    @field:SerializedName("places")
    val places: List<TourismResponse>
)