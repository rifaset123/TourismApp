package com.dicoding.tourismapp.core.data.source.remote.network

import com.dicoding.tourismapp.core.data.source.remote.response.ListTourismResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("list") // endpoint
    suspend fun getList(): ListTourismResponse // suspend supaya bisa dipanggil di coroutine
}