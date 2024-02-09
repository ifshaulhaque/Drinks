package com.example.drinks.model

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class DrinkModel(

  @SerializedName("idDrink") var idDrink: String? = null,
  @SerializedName("strDrink") var strDrink: String? = null,
  @SerializedName("strDrinkAlternate") var strDrinkAlternate: String? = null,
  @SerializedName("strTags") var strTags: String? = null,
  @SerializedName("strVideo") var strVideo: String? = null,
  @SerializedName("strCategory") var strCategory: String? = null,
  @SerializedName("strIBA") var strIBA: String? = null,
  @SerializedName("strAlcoholic") var strAlcoholic: String? = null,
  @SerializedName("strGlass") var strGlass: String? = null,
  @SerializedName("strInstructions") var strInstructions: String? = null,
  @SerializedName("strInstructionsES") var strInstructionsES: String? = null,
  @SerializedName("strInstructionsDE") var strInstructionsDE: String? = null,
  @SerializedName("strInstructionsFR") var strInstructionsFR: String? = null,
  @SerializedName("strInstructionsIT") var strInstructionsIT: String? = null,
  @SerializedName("strDrinkThumb") var strDrinkThumb: String? = null,
  @SerializedName("strIngredient1") var strIngredient1: String? = null,
  @SerializedName("strIngredient2") var strIngredient2: String? = null,
  @SerializedName("strIngredient3") var strIngredient3: String? = null,
  @SerializedName("strIngredient4") var strIngredient4: String? = null,
  @SerializedName("strIngredient5") var strIngredient5: String? = null,
  @SerializedName("strIngredient6") var strIngredient6: String? = null,
  @SerializedName("strIngredient7") var strIngredient7: String? = null,
  @SerializedName("strIngredient8") var strIngredient8: String? = null,
  @SerializedName("strIngredient9") var strIngredient9: String? = null,
  @SerializedName("strIngredient10") var strIngredient10: String? = null,
  @SerializedName("strIngredient11") var strIngredient11: String? = null,
  @SerializedName("strIngredient12") var strIngredient12: String? = null,
  @SerializedName("strIngredient13") var strIngredient13: String? = null,
  @SerializedName("strIngredient14") var strIngredient14: String? = null,
  @SerializedName("strIngredient15") var strIngredient15: String? = null,
  @SerializedName("strMeasure1") var strMeasure1: String? = null,
  @SerializedName("strMeasure2") var strMeasure2: String? = null,
  @SerializedName("strMeasure3") var strMeasure3: String? = null,
  @SerializedName("strMeasure4") var strMeasure4: String? = null,
  @SerializedName("strMeasure5") var strMeasure5: String? = null,
  @SerializedName("strMeasure6") var strMeasure6: String? = null,
  @SerializedName("strMeasure7") var strMeasure7: String? = null,
  @SerializedName("strMeasure8") var strMeasure8: String? = null,
  @SerializedName("strMeasure9") var strMeasure9: String? = null,
  @SerializedName("strMeasure10") var strMeasure10: String? = null,
  @SerializedName("strMeasure11") var strMeasure11: String? = null,
  @SerializedName("strMeasure12") var strMeasure12: String? = null,
  @SerializedName("strMeasure13") var strMeasure13: String? = null,
  @SerializedName("strMeasure14") var strMeasure14: String? = null,
  @SerializedName("strMeasure15") var strMeasure15: String? = null,
  @SerializedName("strImageSource") var strImageSource: String? = null,
  @SerializedName("strImageAttribution") var strImageAttribution: String? = null,
  @SerializedName("strCreativeCommonsConfirmed") var strCreativeCommonsConfirmed: String? = null,
  @SerializedName("dateModified") var dateModified: String? = null

)