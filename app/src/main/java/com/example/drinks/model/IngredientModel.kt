package com.example.drinks.model

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class IngredientModel(
  @SerializedName("strIngredient1") var strIngredient1: String? = null,
)
