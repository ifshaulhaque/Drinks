package com.example.drinks.extension

fun Throwable?.toException(): Exception {
  return Exception(this?.message)
}