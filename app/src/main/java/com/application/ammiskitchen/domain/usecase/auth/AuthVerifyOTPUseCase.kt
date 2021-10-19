package com.application.ammiskitchen.domain.usecase.auth

import com.application.ammiskitchen.data.models.request.auth.RequestVerifyOTP
import com.application.ammiskitchen.data.models.response.auth.ResponseVerifyOTP
import com.application.ammiskitchen.data.util.Resource
import com.application.ammiskitchen.domain.repository.AmmisKitchenRepository

class AuthVerifyOTPUseCase(private val ammisKitchenRepository: AmmisKitchenRepository) {
    suspend fun execute(requestVerifyOTP: RequestVerifyOTP): Resource<ResponseVerifyOTP> {
        return ammisKitchenRepository.authVerifyOTP(requestVerifyOTP)
    }
}