package com.example.drinks.api

import com.example.drinks.model.DrinkListModel
import com.example.drinks.model.GenericResponseModel
import com.example.drinks.model.IngredientListModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

  @GET("random.php")
  fun randomDrinks(): Call<GenericResponseModel<DrinkListModel>>

  @GET("list.php?i=list")
  fun getIngredientList(): Call<GenericResponseModel<IngredientListModel>>

  @GET("search.php")
  fun getDrinksByIngredientName(@Query("s") name: String): Call<GenericResponseModel<DrinkListModel>>
}