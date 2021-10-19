package com.application.ammiskitchen.domain.usecase.auth

import com.application.ammiskitchen.data.models.request.auth.RequestSendOTP
import com.application.ammiskitchen.data.models.response.auth.ResponseSendOTP
import com.application.ammiskitchen.data.util.Resource
import com.application.ammiskitchen.domain.repository.AmmisKitchenRepository

class AuthGetOTPUseCase(private val ammisKitchenRepository: AmmisKitchenRepository) {
    suspend fun execute(requestSendOTP: RequestSendOTP): Resource<ResponseSendOTP> {
        return ammisKitchenRepository.authGetOTP(requestSendOTP)
    }
}