package com.application.ammiskitchen.data.datasourceimpl.remote.auth

import com.application.ammiskitchen.data.api.service.AuthService
import com.application.ammiskitchen.data.datasource.remote.auth.AuthRemoteDataSource
import com.application.ammiskitchen.data.models.request.auth.RequestSendOTP
import com.application.ammiskitchen.data.models.request.auth.RequestVerifyOTP
import com.application.ammiskitchen.data.models.response.auth.ResponseSendOTP
import com.application.ammiskitchen.data.models.response.auth.ResponseVerifyOTP
import retrofit2.Response

class AuthRemoteDataSourceImpl(private val authService: AuthService): AuthRemoteDataSource {
    override suspend fun getOTP(requestSendOTP: RequestSendOTP): Response<ResponseSendOTP> {
        return authService.authGetOTP(requestSendOTP)
    }

    override suspend fun verifyOTP(requestVerifyOTP: RequestVerifyOTP): Response<ResponseVerifyOTP> {
        return authService.authVerifyOTP(requestVerifyOTP)
    }
}