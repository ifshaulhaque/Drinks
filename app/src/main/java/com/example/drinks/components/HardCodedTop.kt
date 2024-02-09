package com.example.drinks.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.drinks.R.drawable

@Composable
fun HardCodedTop() {
  Column {
    Row(
      verticalAlignment = Alignment.CenterVertically
    ) {
      Text(
        text = "Near Restaurant",
        style = TextStyle(
          fontSize = 24.sp,
          fontWeight = FontWeight.Bold
        ),
        modifier = Modifier.weight(1f)
      )

      Text(
        text = "See All",
        style = TextStyle(
          fontSize = 16.sp,
        )
      )
    }

    Spacer(modifier = Modifier.height(24.dp))

    Box(
      modifier = Modifier
        .background(
          color = Color.LightGray,
          shape = RoundedCornerShape(20.dp)
        )
        .padding(8.dp)
        .height(100.dp)
    ) {
      Row(
        horizontalArrangement = Arrangement.spacedBy(24.dp),
        modifier = Modifier.fillMaxWidth()
      ) {
        Image(
          painter = painterResource(id = drawable.drink),
          contentDescription = "drinkImage",
          contentScale = ContentScale.Crop,
          modifier = Modifier
            .weight(1f)
            .clip(
              shape = RoundedCornerShape(20.dp)
            )
        )

        Column(
          verticalArrangement = Arrangement.SpaceBetween,
          modifier = Modifier
            .fillMaxHeight()
            .weight(1f)
        ) {
          Text(
            text = "Blue Restaurant",
            style = TextStyle(
              fontSize = 20.sp,
              fontWeight = FontWeight.Bold
            ),
          )
          Text(
            text = "10:00AM - 3:30PM",
            style = TextStyle(
              fontSize = 16.sp,
              color = Color.DarkGray
            )
          )

          Row {
            Text(
              text = "Steve st Road",
              style = TextStyle(
                fontSize = 16.sp,
                color = Color.Red
              )
            )
          }

        }
      }
    }
  }
}

@Composable
@Preview
fun HardCodedTopPreview() {
  HardCodedTop()
}