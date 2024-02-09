package com.example.drinks.api

import com.example.drinks.extension.toException
import com.example.drinks.model.DrinkListModel
import com.example.drinks.model.DrinkModel
import com.example.drinks.model.GenericResponseModel
import com.example.drinks.model.IngredientListModel
import com.example.drinks.model.IngredientModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class Repository @Inject constructor(private val apiService: ApiService) {
  fun getRandomDrinks(
    callback: (Outcome<DrinkListModel>) -> Unit
  ) {
    apiService.randomDrinks()
      .enqueue(object : Callback<GenericResponseModel<DrinkListModel>> {
        override fun onResponse(
          call: Call<GenericResponseModel<DrinkListModel>>,
          response: Response<GenericResponseModel<DrinkListModel>>
        ) {
          callback.invoke(Outcome.Success(response.body()?.data ?: DrinkListModel()))
        }

        override fun onFailure(call: Call<GenericResponseModel<DrinkListModel>>, t: Throwable) {
          callback.invoke(Outcome.Error(error = t.toException()))
        }
      })
  }

  fun getIngredientList(
    callback: (Outcome<IngredientListModel>) -> Unit
  ) {
    apiService.getIngredientList()
      .enqueue(object : Callback<GenericResponseModel<IngredientListModel>> {
        override fun onResponse(
          call: Call<GenericResponseModel<IngredientListModel>>,
          response: Response<GenericResponseModel<IngredientListModel>>
        ) {
          callback.invoke(Outcome.Success(response.body()?.data ?: IngredientListModel()))
        }

        override fun onFailure(call: Call<GenericResponseModel<IngredientListModel>>, t: Throwable) {
          callback.invoke(Outcome.Error(error = t.toException()))
        }
      })
  }

  fun getDrinksByIngredientName(
    name: String,
    callback: (Outcome<DrinkListModel>) -> Unit
  ) {
    apiService.getDrinksByIngredientName(name)
      .enqueue(object : Callback<GenericResponseModel<DrinkListModel>> {
        override fun onResponse(
          call: Call<GenericResponseModel<DrinkListModel>>,
          response: Response<GenericResponseModel<DrinkListModel>>
        ) {
          callback.invoke(Outcome.Success(response.body()?.data ?: DrinkListModel()))
        }

        override fun onFailure(call: Call<GenericResponseModel<DrinkListModel>>, t: Throwable) {
          callback.invoke(Outcome.Error(error = t.toException()))
        }
      })
  }
}