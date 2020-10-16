package com.davidkahan.stackexchange.datamodels

import com.google.gson.annotations.SerializedName

data class Owner(
    @SerializedName("user_id")
    val userId: Int,
    @SerializedName("display_name")
    val displayName: String
)