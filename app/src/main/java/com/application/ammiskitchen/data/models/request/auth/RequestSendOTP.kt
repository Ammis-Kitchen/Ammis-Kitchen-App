package com.application.ammiskitchen.data.models.request.auth


import com.google.gson.annotations.SerializedName

data class RequestSendOTP(
    @SerializedName("phoneNumber")
    val phoneNumber: String
)