package com.application.ammiskitchen.data.datasource.remote.auth

import com.application.ammiskitchen.data.models.request.auth.RequestSendOTP
import com.application.ammiskitchen.data.models.request.auth.RequestVerifyOTP
import com.application.ammiskitchen.data.models.response.auth.ResponseSendOTP
import com.application.ammiskitchen.data.models.response.auth.ResponseVerifyOTP
import retrofit2.Response

interface AuthRemoteDataSource {
    suspend fun getOTP(requestSendOTP: RequestSendOTP): Response<ResponseSendOTP>
    suspend fun verifyOTP(requestVerifyOTP: RequestVerifyOTP): Response<ResponseVerifyOTP>
}