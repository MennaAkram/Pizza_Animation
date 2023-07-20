package com.menna.pizza_animation.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.menna.pizza_animation.ui.theme.Blue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IngredientItem(
    painter: Painter
) {
    var isSelected by remember { mutableStateOf(false) }

    Card(
        onClick = { isSelected = !isSelected },
        shape = CircleShape,
        colors = CardDefaults.cardColors(
            if (isSelected) Blue else Color.Transparent
        ),
    ) {
        Image(
            painter = painter,
            contentDescription = "",
            modifier = Modifier
                .size(70.dp)
                .padding(12.dp),
            contentScale = ContentScale.Fit
        )
    }
}