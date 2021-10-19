package com.application.ammiskitchen.data.models.response.auth

import com.google.gson.annotations.SerializedName

data class ResponseErrorOTP(
    @SerializedName("code")
    val code: Int,
    @SerializedName("details")
    val details: String,
    @SerializedName("status")
    val status: String,
)