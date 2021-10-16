package com.application.ammiskitchen.data.models.entities.auth


import com.google.gson.annotations.SerializedName

data class SendOTPResult(
    @SerializedName("message")
    val message: String,
    @SerializedName("verificationStatus")
    val verificationStatus: String
)