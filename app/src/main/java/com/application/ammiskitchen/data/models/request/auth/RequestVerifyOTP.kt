package com.application.ammiskitchen.data.models.request.auth


import com.google.gson.annotations.SerializedName

data class RequestVerifyOTP(
    @SerializedName("otp")
    val otp: String,
    @SerializedName("phoneNumber")
    val phoneNumber: String
)