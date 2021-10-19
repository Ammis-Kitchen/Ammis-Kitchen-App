package com.application.ammiskitchen.data.api

import androidx.viewbinding.BuildConfig
import com.application.ammiskitchen.data.api.service.AuthService
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RESTClient {
    val okHttpBuilder = OkHttpClient.Builder()
        .readTimeout(30, TimeUnit.SECONDS)
        .connectTimeout(5, TimeUnit.SECONDS)

    val retrofitBuilder = Retrofit.Builder()
        .baseUrl("http://192.168.1.102:5050/api/v1/")
        .addConverterFactory(GsonConverterFactory.create())

    val authService: AuthService = retrofitBuilder
        .client(okHttpBuilder.build())
        .build()
        .create(AuthService::class.java)
}