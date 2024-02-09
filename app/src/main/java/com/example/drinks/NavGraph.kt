package com.example.drinks

import androidx.annotation.Keep
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

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

    }
  }
}

@Keep
open class RoutePath(val route: String) {
  data object HomeScreen: RoutePath("HomeScreen")
}