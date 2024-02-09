package com.example.drinks.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.drinks.R
import com.example.drinks.model.DrinkModel
import kotlin.random.Random

@Composable
fun DrinkGridCard(
  drinkModel: DrinkModel,
  preview: Boolean = false
) {
  Box(
    modifier = Modifier
      .background(
        color = MaterialTheme.colorScheme.secondaryContainer,
        shape = RoundedCornerShape(20.dp)
      )
      .padding(8.dp)
  ) {
    Column {
      if (preview) {
        Image(
          painter = painterResource(id = R.drawable.drink),
          contentDescription = "drinkImage",
          contentScale = ContentScale.Crop,
          modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .clip(
              shape = RoundedCornerShape(20.dp)
            )
        )
      } else {
        AsyncImage(
          model = ImageRequest.Builder(LocalContext.current)
            .data(drinkModel.strDrinkThumb)
            .crossfade(true)
            .build(),
          placeholder = painterResource(R.drawable.drink),
          contentDescription = "drinkImage",
          contentScale = ContentScale.Crop,
          modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .clip(
              shape = RoundedCornerShape(20.dp)
            )
        )
      }

      drinkModel.strDrink?.let {
        Text(
          text = it,
          style = TextStyle(
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
          )
        )
      }

      drinkModel.strCategory?.let {
        Text(
          text = it,
          style = TextStyle(
            fontSize = 12.sp,
          )
        )
      }

      Text(
        text = "₹ ${Random.nextInt(100, 2001)}",
        style = TextStyle(
          fontSize = 16.sp,
          color = MaterialTheme.colorScheme.primary
        ),
      )

      Button(
        modifier = Modifier.fillMaxWidth(),
        onClick = {}
      ) {
        Row {
          Text(
            text = "+ Add",
            style = TextStyle(
              fontSize = 16.sp,
              color = Companion.White
            )
          )
        }
      }
    }
  }
}

@Composable
@Preview
fun DrinkGridCardPreview() {
  DrinkGridCard(
    preview = true,
    drinkModel = DrinkModel(
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
}