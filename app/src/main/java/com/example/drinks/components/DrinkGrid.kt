package com.example.drinks.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.drinks.model.DrinkModel

@Composable
fun DrinkGrid(
  items: List<DrinkModel>
) {
  val itemList = arrayListOf<@Composable () -> Unit>()
  items.forEach {item ->
    itemList.add {
      DrinkGridCard(
        drinkModel = item
      )
    }
  }

  CustomVerticalGrid(
    verticalSpacing = 24.dp,
    horizontalSpacing = 24.dp,
    items = itemList,
    staggered = true
  )
}

@Composable
@Preview
fun DrinkGridPreview() {
  DrinkGrid(
    items = listOf(
      DrinkModel(
        idDrink = "12138",
        strDrink = "Scotch Cobbler",
        strCategory = "Ordinary Drink",
        strAlcoholic = "Alcoholic",
        strGlass = "Old-fashioned glass",
        strInstructions = "Pour scotch, brandy, and curacao over ice in an old-fashioned glass. Add the orange slice, top with the mint sprig, and serve.",
        strInstructionsDE = "Gießen Sie Scotch, Brandy und Curacao in einem old-fashioned Glas über Eis. Die Orangenscheibe dazugeben, mit dem Minzzweig garnieren und servieren.",
        strInstructionsIT = "Versa scotch, brandy e curacao sul ghiaccio in un bicchiere vecchio stile. Aggiungere la fetta d'arancia, guarnire con il rametto di menta e servire.",
        strDrinkThumb = "https://www.thecocktaildb.com/images/media/drink/1q7coh1504736227.jpg",
        strIngredient1 = "Scotch",
        strIngredient2 = "Brandy",
        strIngredient3 = "Curacao",
        strIngredient4 = "Orange",
        strIngredient5 = "Mint",
        strMeasure1 = "2 oz ",
        strMeasure2 = "4 dashes ",
        strMeasure3 = "4 dashes ",
        strMeasure4 = "1 slice ",
        strMeasure5 = "1 ",
        strCreativeCommonsConfirmed = "No",
        dateModified = "2017-09-06 23:17:07"
      ),
      DrinkModel(
        idDrink = "12138",
        strDrink = "Scotch Cobbler",
        strCategory = "Ordinary Drink",
        strAlcoholic = "Alcoholic",
        strGlass = "Old-fashioned glass",
        strInstructions = "Pour scotch, brandy, and curacao over ice in an old-fashioned glass. Add the orange slice, top with the mint sprig, and serve.",
        strInstructionsDE = "Gießen Sie Scotch, Brandy und Curacao in einem old-fashioned Glas über Eis. Die Orangenscheibe dazugeben, mit dem Minzzweig garnieren und servieren.",
        strInstructionsIT = "Versa scotch, brandy e curacao sul ghiaccio in un bicchiere vecchio stile. Aggiungere la fetta d'arancia, guarnire con il rametto di menta e servire.",
        strDrinkThumb = "https://www.thecocktaildb.com/images/media/drink/1q7coh1504736227.jpg",
        strIngredient1 = "Scotch",
        strIngredient2 = "Brandy",
        strIngredient3 = "Curacao",
        strIngredient4 = "Orange",
        strIngredient5 = "Mint",
        strMeasure1 = "2 oz ",
        strMeasure2 = "4 dashes ",
        strMeasure3 = "4 dashes ",
        strMeasure4 = "1 slice ",
        strMeasure5 = "1 ",
        strCreativeCommonsConfirmed = "No",
        dateModified = "2017-09-06 23:17:07"
      ),
      DrinkModel(
        idDrink = "12138",
        strDrink = "Scotch Cobbler",
        strCategory = "Ordinary Drink",
        strAlcoholic = "Alcoholic",
        strGlass = "Old-fashioned glass",
        strInstructions = "Pour scotch, brandy, and curacao over ice in an old-fashioned glass. Add the orange slice, top with the mint sprig, and serve.",
        strInstructionsDE = "Gießen Sie Scotch, Brandy und Curacao in einem old-fashioned Glas über Eis. Die Orangenscheibe dazugeben, mit dem Minzzweig garnieren und servieren.",
        strInstructionsIT = "Versa scotch, brandy e curacao sul ghiaccio in un bicchiere vecchio stile. Aggiungere la fetta d'arancia, guarnire con il rametto di menta e servire.",
        strDrinkThumb = "https://www.thecocktaildb.com/images/media/drink/1q7coh1504736227.jpg",
        strIngredient1 = "Scotch",
        strIngredient2 = "Brandy",
        strIngredient3 = "Curacao",
        strIngredient4 = "Orange",
        strIngredient5 = "Mint",
        strMeasure1 = "2 oz ",
        strMeasure2 = "4 dashes ",
        strMeasure3 = "4 dashes ",
        strMeasure4 = "1 slice ",
        strMeasure5 = "1 ",
        strCreativeCommonsConfirmed = "No",
        dateModified = "2017-09-06 23:17:07"
      ),
      DrinkModel(
        idDrink = "12138",
        strDrink = "Scotch Cobbler",
        strCategory = "Ordinary Drink",
        strAlcoholic = "Alcoholic",
        strGlass = "Old-fashioned glass",
        strInstructions = "Pour scotch, brandy, and curacao over ice in an old-fashioned glass. Add the orange slice, top with the mint sprig, and serve.",
        strInstructionsDE = "Gießen Sie Scotch, Brandy und Curacao in einem old-fashioned Glas über Eis. Die Orangenscheibe dazugeben, mit dem Minzzweig garnieren und servieren.",
        strInstructionsIT = "Versa scotch, brandy e curacao sul ghiaccio in un bicchiere vecchio stile. Aggiungere la fetta d'arancia, guarnire con il rametto di menta e servire.",
        strDrinkThumb = "https://www.thecocktaildb.com/images/media/drink/1q7coh1504736227.jpg",
        strIngredient1 = "Scotch",
        strIngredient2 = "Brandy",
        strIngredient3 = "Curacao",
        strIngredient4 = "Orange",
        strIngredient5 = "Mint",
        strMeasure1 = "2 oz ",
        strMeasure2 = "4 dashes ",
        strMeasure3 = "4 dashes ",
        strMeasure4 = "1 slice ",
        strMeasure5 = "1 ",
        strCreativeCommonsConfirmed = "No",
        dateModified = "2017-09-06 23:17:07"
      ),
      DrinkModel(
        idDrink = "12138",
        strDrink = "Scotch Cobbler",
        strCategory = "Ordinary Drink",
        strAlcoholic = "Alcoholic",
        strGlass = "Old-fashioned glass",
        strInstructions = "Pour scotch, brandy, and curacao over ice in an old-fashioned glass. Add the orange slice, top with the mint sprig, and serve.",
        strInstructionsDE = "Gießen Sie Scotch, Brandy und Curacao in einem old-fashioned Glas über Eis. Die Orangenscheibe dazugeben, mit dem Minzzweig garnieren und servieren.",
        strInstructionsIT = "Versa scotch, brandy e curacao sul ghiaccio in un bicchiere vecchio stile. Aggiungere la fetta d'arancia, guarnire con il rametto di menta e servire.",
        strDrinkThumb = "https://www.thecocktaildb.com/images/media/drink/1q7coh1504736227.jpg",
        strIngredient1 = "Scotch",
        strIngredient2 = "Brandy",
        strIngredient3 = "Curacao",
        strIngredient4 = "Orange",
        strIngredient5 = "Mint",
        strMeasure1 = "2 oz ",
        strMeasure2 = "4 dashes ",
        strMeasure3 = "4 dashes ",
        strMeasure4 = "1 slice ",
        strMeasure5 = "1 ",
        strCreativeCommonsConfirmed = "No",
        dateModified = "2017-09-06 23:17:07"
      ),DrinkModel(
        idDrink = "12138",
        strDrink = "Scotch Cobbler",
        strCategory = "Ordinary Drink",
        strAlcoholic = "Alcoholic",
        strGlass = "Old-fashioned glass",
        strInstructions = "Pour scotch, brandy, and curacao over ice in an old-fashioned glass. Add the orange slice, top with the mint sprig, and serve.",
        strInstructionsDE = "Gießen Sie Scotch, Brandy und Curacao in einem old-fashioned Glas über Eis. Die Orangenscheibe dazugeben, mit dem Minzzweig garnieren und servieren.",
        strInstructionsIT = "Versa scotch, brandy e curacao sul ghiaccio in un bicchiere vecchio stile. Aggiungere la fetta d'arancia, guarnire con il rametto di menta e servire.",
        strDrinkThumb = "https://www.thecocktaildb.com/images/media/drink/1q7coh1504736227.jpg",
        strIngredient1 = "Scotch",
        strIngredient2 = "Brandy",
        strIngredient3 = "Curacao",
        strIngredient4 = "Orange",
        strIngredient5 = "Mint",
        strMeasure1 = "2 oz ",
        strMeasure2 = "4 dashes ",
        strMeasure3 = "4 dashes ",
        strMeasure4 = "1 slice ",
        strMeasure5 = "1 ",
        strCreativeCommonsConfirmed = "No",
        dateModified = "2017-09-06 23:17:07"
      )
    )
  )
}