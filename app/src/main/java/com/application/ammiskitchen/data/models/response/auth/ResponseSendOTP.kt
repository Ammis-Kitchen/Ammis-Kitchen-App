package com.application.ammiskitchen.data.models.response.auth


import com.application.ammiskitchen.data.models.entities.auth.SendOTPResult
import com.google.gson.annotations.SerializedName

data class ResponseSendOTP(
    @SerializedName("code")
    val code: Int,
    @SerializedName("result")
    val sendOTPResult: SendOTPResult,
    @SerializedName("status")
    val status: String,
    @SerializedName("details")
    val details: String
)