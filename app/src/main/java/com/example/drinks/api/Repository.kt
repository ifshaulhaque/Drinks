package com.example.drinks.api

import com.example.drinks.extension.toException
import com.example.drinks.model.DrinkListModel
import com.example.drinks.model.IngredientListModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class Repository @Inject constructor(private val apiService: ApiService) {
  fun getRandomDrinks(
    callback: (Outcome<DrinkListModel>) -> Unit
  ) {
    apiService.randomDrinks()
      .enqueue(object : Callback<DrinkListModel> {
        override fun onResponse(
          call: Call<DrinkListModel>,
          response: Response<DrinkListModel>
        ) {
          callback.invoke(Outcome.Success(response.body() ?: DrinkListModel()))
        }

        override fun onFailure(call: Call<DrinkListModel>, t: Throwable) {
          callback.invoke(Outcome.Error(error = t.toException()))
        }
      })
  }

  fun getIngredientList(
    callback: (Outcome<IngredientListModel>) -> Unit
  ) {
    apiService.getIngredientList()
      .enqueue(object : Callback<IngredientListModel> {
        override fun onResponse(
          call: Call<IngredientListModel>,
          response: Response<IngredientListModel>
        ) {
          callback.invoke(Outcome.Success(response.body() ?: IngredientListModel()))
        }

        override fun onFailure(call: Call<IngredientListModel>, t: Throwable) {
          callback.invoke(Outcome.Error(error = t.toException()))
        }
      })
  }

  fun getDrinksByIngredientName(
    name: String,
    callback: (Outcome<DrinkListModel>) -> Unit
  ) {
    apiService.getDrinksByIngredientName(name)
      .enqueue(object : Callback<DrinkListModel> {
        override fun onResponse(
          call: Call<DrinkListModel>,
          response: Response<DrinkListModel>
        ) {
          callback.invoke(Outcome.Success(response.body() ?: DrinkListModel()))
        }

        override fun onFailure(call: Call<DrinkListModel>, t: Throwable) {
          callback.invoke(Outcome.Error(error = t.toException()))
        }
      })
  }
}