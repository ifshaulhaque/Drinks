package com.example.drinks.api

import com.example.drinks.Constants.BASE_URL
import com.example.drinks.model.DrinkModel
import com.example.drinks.model.GenericResponseModel
import com.example.drinks.model.IngredientModel
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

  @GET("random.php")
  fun randomDrinks(): Call<GenericResponseModel<List<DrinkModel>>>

  @GET("list.php?i=list")
  fun getIngredientList(): Call<GenericResponseModel<List<IngredientModel>>>

  @GET("search.php")
  fun getDrinksByIngredientName(@Query("s") name: String): Call<GenericResponseModel<List<DrinkModel>>>
}