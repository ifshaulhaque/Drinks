package com.example.drinks.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.drinks.components.DrinkGrid
import com.example.drinks.components.HardCodedTop

@Composable
fun HomeScreen(
  navController: NavController,
  homeScreenViewModel: HomeScreenViewModel? = hiltViewModel()
) {
  Column(
    verticalArrangement = Arrangement.spacedBy(16.dp),
    modifier = Modifier.padding(24.dp)
  ) {
    Text(
      text = "Let\'s eat \nQuality food",
      style = TextStyle(
        fontSize = 32.sp,
        fontWeight = FontWeight.ExtraBold
      )
    )

    HardCodedTop()

    homeScreenViewModel?.drinkList?.value?.let { DrinkGrid(items = it) }
  }
}

@Composable
@Preview
fun HomeScreenPreview() {
  HomeScreen(navController = rememberNavController());
}