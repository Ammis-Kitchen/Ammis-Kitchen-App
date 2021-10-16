package com.application.ammiskitchen.data.models.response.auth


import com.application.ammiskitchen.data.models.entities.auth.VerifyOTPResult
import com.google.gson.annotations.SerializedName

data class ResponseVerifyOTP(
    @SerializedName("code")
    val code: Int,
    @SerializedName("result")
    val verifyOTPResult: VerifyOTPResult,
    @SerializedName("status")
    val status: String,
    @SerializedName("details")
    val details: String
)