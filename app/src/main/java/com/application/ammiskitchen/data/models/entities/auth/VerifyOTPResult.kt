package com.application.ammiskitchen.data.models.entities.auth


import com.google.gson.annotations.SerializedName

data class VerifyOTPResult(
    @SerializedName("exists")
    val exists: Boolean,
    @SerializedName("message")
    val message: String,
    @SerializedName("tokens")
    val tokens: Tokens,
    @SerializedName("user")
    val user: User,
    @SerializedName("verificationStatus")
    val verificationStatus: String
)