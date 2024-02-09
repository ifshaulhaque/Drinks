package com.example.drinks.api

import com.example.drinks.model.DrinkListModel
import com.example.drinks.model.IngredientListModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

  @GET("random.php")
  fun randomDrinks(): Call<DrinkListModel>

  @GET("list.php?i=list")
  fun getIngredientList(): Call<IngredientListModel>

  @GET("search.php")
  fun getDrinksByIngredientName(@Query("s") name: String): Call<DrinkListModel>
}