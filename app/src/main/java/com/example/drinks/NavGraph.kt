package com.example.drinks

import androidx.annotation.Keep
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.drinks.home.HomeScreen

@Composable
fun NavGraph(
  navController: NavHostController = rememberNavController()
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
  }
}

@Keep
open class RoutePath(val route: String) {
  data object HomeScreen: RoutePath("HomeScreen")
}