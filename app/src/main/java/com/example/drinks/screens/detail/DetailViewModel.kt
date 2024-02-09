package com.example.drinks.screens.detail

import androidx.lifecycle.ViewModel
import com.example.drinks.model.DrinkModel
import com.google.gson.Gson
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(
  private val gson: Gson
): ViewModel() {
  fun getDrinkString(drinkModel: DrinkModel): String? {
    return gson.toJson(drinkModel, DrinkModel::class.java)
  }
}