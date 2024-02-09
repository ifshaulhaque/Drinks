package com.example.drinks.model

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class DrinkListModel(
  @SerializedName("drinks" ) var drinks : ArrayList<DrinkModel> = arrayListOf()
)
