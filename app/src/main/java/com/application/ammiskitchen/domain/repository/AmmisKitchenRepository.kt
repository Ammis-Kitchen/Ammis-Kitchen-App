package com.application.ammiskitchen.domain.repository

import com.application.ammiskitchen.data.models.request.auth.RequestSendOTP
import com.application.ammiskitchen.data.models.request.auth.RequestVerifyOTP
import com.application.ammiskitchen.data.models.response.auth.ResponseSendOTP
import com.application.ammiskitchen.data.models.response.auth.ResponseVerifyOTP
import com.application.ammiskitchen.data.util.Resource

interface AmmisKitchenRepository {
    //Auth
    suspend fun authGetOTP(requestSendOTP: RequestSendOTP): Resource<ResponseSendOTP>
    suspend fun authVerifyOTP(requestVerifyOTP: RequestVerifyOTP): Resource<ResponseVerifyOTP>
}