package com.example.drinks.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun CustomVerticalGrid(
  verticalSpacing: Dp = 0.dp,
  horizontalSpacing: Dp = 0.dp,
  items: List<@Composable () -> Unit>,
  staggered: Boolean = false
) {
  val itemSize = items.size

  if (staggered) {
    Row(
      horizontalArrangement = Arrangement.spacedBy(horizontalSpacing)
    ) {
      Column(
        verticalArrangement = Arrangement.spacedBy(verticalSpacing),
        modifier = Modifier.weight(1f)
      ) {
        for (index in 0..<itemSize step 2) {
          items[index]()
        }
      }
      Column(
        verticalArrangement = Arrangement.spacedBy(verticalSpacing),
        modifier = Modifier.weight(1f)
      ) {
        for (index in 1..<itemSize step 2) {
          items[index]()
        }
      }
    }
  } else {
    Column(
      modifier = Modifier.fillMaxSize(),
      verticalArrangement = Arrangement.spacedBy(verticalSpacing),
    ) {
      for (index in 0 until itemSize step 2) {
        Row(
          modifier = Modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Min),
          horizontalArrangement = Arrangement.spacedBy(horizontalSpacing),
        ) {
          Box(
            modifier = Modifier
              .weight(1f)
              .fillMaxHeight()
          ) {
            items.getOrNull(index)?.invoke()
          }
          Box(
            modifier = Modifier
              .weight(1f)
              .fillMaxHeight()
          ) {
            items.getOrNull(index + 1)?.invoke()
          }
        }
      }
    }
  }
}