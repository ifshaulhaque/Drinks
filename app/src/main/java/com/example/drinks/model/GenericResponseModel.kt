package com.example.drinks.model

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class GenericResponseModel<T>(
    @SerializedName("code") val code: Int,
    @SerializedName("result") val result: String,
    @SerializedName("result_description") val resultDescription: String,
    @SerializedName("data") val data: T,
)