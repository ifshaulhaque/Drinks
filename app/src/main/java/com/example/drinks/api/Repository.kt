package com.example.drinks.api

import com.example.drinks.extension.toException
import com.example.drinks.model.DrinkModel
import com.example.drinks.model.GenericResponseModel
import com.example.drinks.model.IngredientModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class Repository @Inject constructor(private val apiService: ApiService) {
  fun getRandomDrinks(
    callback: (Outcome<List<DrinkModel>>) -> Unit
  ) {
    apiService.randomDrinks()
      .enqueue(object : Callback<GenericResponseModel<List<DrinkModel>>> {
        override fun onResponse(
          call: Call<GenericResponseModel<List<DrinkModel>>>,
          response: Response<GenericResponseModel<List<DrinkModel>>>
        ) {
          callback.invoke(Outcome.Success(response.body()?.data ?: emptyList()))
        }

        override fun onFailure(call: Call<GenericResponseModel<List<DrinkModel>>>, t: Throwable) {
          callback.invoke(Outcome.Error(error = t.toException()))
        }
      })
  }

  fun getIngredientList(
    callback: (Outcome<List<IngredientModel>>) -> Unit
  ) {
    apiService.getIngredientList()
      .enqueue(object : Callback<GenericResponseModel<List<IngredientModel>>> {
        override fun onResponse(
          call: Call<GenericResponseModel<List<IngredientModel>>>,
          response: Response<GenericResponseModel<List<IngredientModel>>>
        ) {
          callback.invoke(Outcome.Success(response.body()?.data ?: emptyList()))
        }

        override fun onFailure(call: Call<GenericResponseModel<List<IngredientModel>>>, t: Throwable) {
          callback.invoke(Outcome.Error(error = t.toException()))
        }
      })
  }

  fun getDrinksByIngredientName(
    name: String,
    callback: (Outcome<List<DrinkModel>>) -> Unit
  ) {
    apiService.getDrinksByIngredientName(name)
      .enqueue(object : Callback<GenericResponseModel<List<DrinkModel>>> {
        override fun onResponse(
          call: Call<GenericResponseModel<List<DrinkModel>>>,
          response: Response<GenericResponseModel<List<DrinkModel>>>
        ) {
          callback.invoke(Outcome.Success(response.body()?.data ?: emptyList()))
        }

        override fun onFailure(call: Call<GenericResponseModel<List<DrinkModel>>>, t: Throwable) {
          callback.invoke(Outcome.Error(error = t.toException()))
        }
      })
  }
}