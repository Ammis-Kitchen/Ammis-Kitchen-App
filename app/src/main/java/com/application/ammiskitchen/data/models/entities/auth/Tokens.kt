package com.application.ammiskitchen.data.models.entities.auth


import com.google.gson.annotations.SerializedName

data class Tokens(
    @SerializedName("accessToken")
    val accessToken: String,
    @SerializedName("refreshToken")
    val refreshToken: String
)