package com.application.ammiskitchen.data.models.entities.auth


import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("id")
    val id: String,
    @SerializedName("phoneNumber")
    val phoneNumber: String
)