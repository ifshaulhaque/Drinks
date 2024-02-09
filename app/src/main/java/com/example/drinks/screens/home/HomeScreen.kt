package com.example.drinks.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.drinks.components.DrinkGrid
import com.example.drinks.components.HardCodedTop
import com.example.drinks.components.Search
import com.example.drinks.model.IngredientModel

@Composable
fun HomeScreen(
  navController: NavController,
  homeScreenViewModel: HomeScreenViewModel? = hiltViewModel()
) {
  val searchString = remember { mutableStateOf(IngredientModel(strIngredient1 = null)) }

  Column(
    verticalArrangement = Arrangement.spacedBy(16.dp),
    modifier = Modifier
      .padding(horizontal = 24.dp)
      .verticalScroll(rememberScrollState())
  ) {
    Text(
      text = "Let\'s eat \nQuality food",
      style = TextStyle(
        fontSize = 32.sp,
        fontWeight = FontWeight.ExtraBold
      )
    )

    HardCodedTop()

    Search(
      items = homeScreenViewModel?.ingredientList?.value ?: emptyList(),
      selectedItem = searchString,
      onSelectedItemChange = {
        searchString.value.strIngredient1?.let { homeScreenViewModel?.getDrinksByIngredientName(it) }
      }
    )

    if (homeScreenViewModel?.drinkList?.value != null) {
      DrinkGrid(items = homeScreenViewModel?.drinkList?.value!!)
    } else {
      Text(
        text = "Sorry No Drink is Available",
        style = TextStyle(
          fontSize = 12.sp,
          color = MaterialTheme.colorScheme.error
        )
      )
    }
  }
}

@Composable
@Preview
fun HomeScreenPreview() {
  HomeScreen(navController = rememberNavController());
}