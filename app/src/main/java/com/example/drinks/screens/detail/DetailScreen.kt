package com.example.drinks.screens.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextAlign.Companion
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import coil.request.ImageRequest.Builder
import com.example.drinks.R.drawable
import com.example.drinks.model.DrinkModel

@Composable
fun DetailScreen(
  navController: NavController,
  preview: Boolean = false,
  drinkModel: DrinkModel?
) {
  Column(
    verticalArrangement = Arrangement.spacedBy(16.dp),
    modifier = Modifier
      .fillMaxSize()
      .padding(24.dp)
  ) {
    if (preview) {
      Image(
        painter = painterResource(id = drawable.drink),
        contentDescription = "drinkImage",
        contentScale = ContentScale.Crop,
        modifier = Modifier
          .fillMaxWidth()
          .height(300.dp)
          .clip(
            shape = RoundedCornerShape(20.dp)
          )
      )
    } else {
      AsyncImage(
        model = Builder(LocalContext.current)
          .data(drinkModel?.strDrinkThumb)
          .crossfade(true)
          .build(),
        placeholder = painterResource(drawable.drink),
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

    Column(
      horizontalAlignment = Alignment.CenterHorizontally,
      modifier = Modifier
        .fillMaxSize()
        .weight(1f)
    ) {
      drinkModel?.strDrink?.let {
        Text(
          text = it,
          style = TextStyle(
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
          )
        )
      }

      drinkModel?.strCategory?.let {
        Text(
          text = it,
          style = TextStyle(
            fontSize = 12.sp,
          )
        )
      }

      drinkModel?.strInstructions?.let {
        Text(
          text = it,
          textAlign = TextAlign.Center,
          style = TextStyle(
            fontSize = 12.sp,
            color = MaterialTheme.colorScheme.tertiary
          )
        )
      }
    }

    Button(
      modifier = Modifier.fillMaxWidth(),
      onClick = {}
    ) {
      Row {
        Text(
          text = "+ Add",
          style = TextStyle(
            fontSize = 16.sp,
            color = Color.White
          )
        )
      }
    }

  }
}

@Composable
@Preview(showBackground = true)
fun DetailScreenPreview() {
  DetailScreen(
    navController = rememberNavController(),
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