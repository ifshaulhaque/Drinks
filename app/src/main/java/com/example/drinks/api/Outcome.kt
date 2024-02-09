package com.example.drinks.api

import androidx.annotation.Keep

@Keep
sealed class Outcome<out T> {
  data class Success<out T>(val value: T) : Outcome<T>()
  data class Error<out T>(val value: T? = null, val error: Exception) : Outcome<T>()
  data object Idle: Outcome<Nothing>()
}