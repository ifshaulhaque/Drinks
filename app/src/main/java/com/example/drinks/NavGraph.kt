package com.example.drinks

import androidx.annotation.Keep
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.drinks.Constants.DETAIL_DEVICE
import com.example.drinks.model.DrinkModel
import com.example.drinks.screens.detail.DetailScreen
import com.example.drinks.screens.home.HomeScreen
import com.google.gson.Gson

@Composable
fun NavGraph(
  navController: NavHostController = rememberNavController(),
  gson: Gson?
) {
  NavHost(
    navController = navController,
    startDestination = RoutePath.HomeScreen.route
  ) {
    setComposable(
      route = RoutePath.HomeScreen.route
    ) {
      HomeScreen(navController = navController)
    }

    setComposable(
      route = RoutePath.DetailScreen.route,
      arguments = listOf(
        navArgument(DETAIL_DEVICE) {
          type = NavType.StringType
        }
      )
    ) {
      val serializedString = it.arguments?.getString(DETAIL_DEVICE)
      serializedString?.let { details ->
        val drink = gson?.fromJson(details, DrinkModel::class.java)
        DetailScreen(
          navController = navController, drinkModel = drink
        )
      }
    }
  }
}

@Keep
open class RoutePath(val route: String) {
  data object HomeScreen: RoutePath("HomeScreen")

  data object DetailScreen : RoutePath(route = "DetailScreen/{$DETAIL_DEVICE}") {
    fun passDrink(drink: String): String {
      return "AddDeviceScreen/$drink"
    }
  }
}