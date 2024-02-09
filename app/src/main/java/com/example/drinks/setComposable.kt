package com.example.drinks

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavDeepLink
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.drinks.Constants.SCREEN_ANIMATION_TIME_MILLIS

fun NavGraphBuilder.setComposable(
  route: String,
  arguments: List<NamedNavArgument> = emptyList(),
  content: @Composable AnimatedVisibilityScope.(NavBackStackEntry) -> Unit
) {
  return composable(
    route = route,
    arguments = arguments,
    enterTransition = {
      slideIntoContainer(
        AnimatedContentTransitionScope.SlideDirection.Left,
        animationSpec = tween(SCREEN_ANIMATION_TIME_MILLIS)
      )
    },
    exitTransition = {
      slideOutOfContainer(
        AnimatedContentTransitionScope.SlideDirection.Left,
        animationSpec = tween(SCREEN_ANIMATION_TIME_MILLIS)
      )
    },
    popEnterTransition = {
      slideIntoContainer(
        AnimatedContentTransitionScope.SlideDirection.Right,
        animationSpec = tween(SCREEN_ANIMATION_TIME_MILLIS)
      )
    },
    popExitTransition = {
      slideOutOfContainer(
        AnimatedContentTransitionScope.SlideDirection.Right,
        animationSpec = tween(SCREEN_ANIMATION_TIME_MILLIS)
      )
    },
    content = content
  )
}