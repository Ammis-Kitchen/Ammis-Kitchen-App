package com.application.ammiskitchen.data.api.service

import com.application.ammiskitchen.data.models.request.auth.RequestSendOTP
import com.application.ammiskitchen.data.models.request.auth.RequestVerifyOTP
import com.application.ammiskitchen.data.models.response.auth.ResponseSendOTP
import com.application.ammiskitchen.data.models.response.auth.ResponseVerifyOTP
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {
    //Phone Verification Get OTP
    @POST("auth/phone/verifications")
    suspend fun authGetOTP(@Body requestSendOTP: RequestSendOTP): Response<ResponseSendOTP>

    //Phone Verification verify OTP
    @POST("auth/phone/verification-check")
    suspend fun authVerifyOTP(@Body requestVerifyOTP: RequestVerifyOTP): Response<ResponseVerifyOTP>
}