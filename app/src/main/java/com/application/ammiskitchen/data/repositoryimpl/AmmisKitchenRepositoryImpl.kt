package com.application.ammiskitchen.data.repositoryimpl

import com.application.ammiskitchen.data.datasource.remote.auth.AuthRemoteDataSource
import com.application.ammiskitchen.data.models.request.auth.RequestSendOTP
import com.application.ammiskitchen.data.models.request.auth.RequestVerifyOTP
import com.application.ammiskitchen.data.models.response.auth.ResponseSendOTP
import com.application.ammiskitchen.data.models.response.auth.ResponseVerifyOTP
import com.application.ammiskitchen.data.util.Resource
import com.application.ammiskitchen.domain.repository.AmmisKitchenRepository

class AmmisKitchenRepositoryImpl(
    private val authRemoteDataSource: AuthRemoteDataSource
): AmmisKitchenRepository{
    override suspend fun authGetOTP(requestSendOTP: RequestSendOTP): Resource<ResponseSendOTP> {
        val response = authRemoteDataSource.getOTP(requestSendOTP)
        if (response.code() == 200) {
            response.body()?.let {
                return Resource.Success(data = it)
            }
        } else if (response.code() == 500) {
            return Resource.Error(message = "Internal server error. Please try again later.")
        }
        return Resource.Error(message = "Internal server error. Please try again later.")
    }

    override suspend fun authVerifyOTP(requestVerifyOTP: RequestVerifyOTP): Resource<ResponseVerifyOTP> {
        val response = authRemoteDataSource.verifyOTP(requestVerifyOTP)
        if (response.code() == 200) {
            response.body()?.let {
                return Resource.Success(data = it)
            }
        } else if (response.code() == 404) {
            return Resource.Error(message = "Internal server error. Please try again later.")
        } else if (response.code() == 401) {
            return Resource.Error(message = "Incorrect OTP")
        }
        return Resource.Error(message = "Internal server error. Please try again later.")
    }
}