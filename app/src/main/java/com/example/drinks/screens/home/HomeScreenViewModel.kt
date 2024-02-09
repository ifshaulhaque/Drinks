package com.example.drinks.screens.home

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.drinks.api.Outcome
import com.example.drinks.api.Repository
import com.example.drinks.model.DrinkModel
import com.example.drinks.model.IngredientModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeScreenViewModel @Inject constructor(
  private val repository: Repository
): ViewModel() {
  private val _ingredientList = mutableStateOf<ArrayList<IngredientModel>>(arrayListOf())
  val ingredientList = _ingredientList

  private val _drinksList = mutableStateOf<ArrayList<DrinkModel>>(arrayListOf())
  val drinkList = _drinksList

  init {
    getIngredientList()
    getRandomDrinks()
  }

  private fun getIngredientList() {
    repository.getIngredientList { outcome ->
      if (outcome is Outcome.Success) {
        _ingredientList.value = outcome.value.drinks
      } else {
        Log.e("error","error on getting ingredients")
      }
    }
  }

  private fun getRandomDrinks() {
    repository.getRandomDrinks { outcome ->
      if (outcome is Outcome.Success) {
        _drinksList.value = outcome.value.drinks
      } else {
        Log.e("error","error on getting Random Drinks")
      }
    }
  }

  fun getDrinksByIngredientName(name: String) {
    repository.getDrinksByIngredientName(name) { outcome ->
      if (outcome is Outcome.Success) {
        _drinksList.value = outcome.value.drinks
      } else {
        Log.e("error","error on getting DrinksByIngredientName")
      }
    }
  }
}