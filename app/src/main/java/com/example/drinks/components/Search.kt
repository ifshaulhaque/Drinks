package com.example.drinks.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.drinks.R.drawable
import com.example.drinks.model.IngredientModel

@Composable
fun Search(
  items: List<IngredientModel>,
  selectedItem: MutableState<IngredientModel>,
  onSelectedItemChange: () -> Unit,
  disable: Boolean = false
) {
  val isMenuExpanded = remember { mutableStateOf(false) }

  Column {
    Row(
      verticalAlignment = Alignment.CenterVertically,
      horizontalArrangement = Arrangement.spacedBy(8.dp),
      modifier = Modifier
        .fillMaxWidth()
        .background(
          color = MaterialTheme.colorScheme.primaryContainer,
          shape = RoundedCornerShape(20.dp)
        )
        .clickable {
          if (!disable) {
            isMenuExpanded.value = !isMenuExpanded.value
          }
        }
        .padding(vertical = 8.dp, horizontal = 16.dp)
    ) {
      Text(
        text = selectedItem.value.strIngredient1 ?: "search",
        style = TextStyle(
          fontSize = 16.sp
        ),
        modifier = Modifier
          .fillMaxWidth()
          .weight(1f)
      )

      Icon(
        painter = painterResource(id = drawable.baseline_search_24),
        contentDescription = "search",
        modifier = Modifier
          .size(24.dp)
      )
    }

    DropdownMenu(
      expanded = isMenuExpanded.value,
      offset = DpOffset(x = 0.dp, y = 8.dp),
      onDismissRequest = { isMenuExpanded.value = false },
      modifier = Modifier
        .fillMaxWidth()
        .background(color = MaterialTheme.colorScheme.primaryContainer)
    ) {
      items.forEach { item ->
        DropdownMenuItem(
          onClick = {
            selectedItem.value = item
            isMenuExpanded.value = false
            onSelectedItemChange()
          },
          text = {
            Text(
              text = item.strIngredient1.toString(),
              style = TextStyle(fontSize = 16.sp),
              modifier = Modifier.fillMaxWidth()
            )
          }
        )
      }
    }
  }
}

@Composable
@Preview
fun SearchPreview() {
  Search(
    items = listOf(
      IngredientModel(
        strIngredient1 = "Vodka",
      ),
      IngredientModel(
        strIngredient1 = "Vodka",
      ),
      IngredientModel(
        strIngredient1 = "Vodka",
      ),
    ),
    selectedItem = remember {
      mutableStateOf(
        IngredientModel(
          strIngredient1 = "Vodka",
        )
      )
    },
    onSelectedItemChange = {}
  )
}