package com.menna.pizza_animation.composables

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.menna.pizza_animation.pizza_app.PizzaUIState
import com.menna.pizza_animation.pizza_app.Sizes
import com.menna.pizza_animation.ui.theme.White

@Composable
fun PizzaSize(
    state: PizzaUIState,
) {
Row() {
    SizeItem(text = state.size[0], onClick = { Sizes.Small })
    SizeItem(text = state.size[1], onClick = { Sizes.Medium })
    SizeItem(text = state.size[2], onClick = { Sizes.Large })
}
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SizeItem(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit,
) {
    var isSelected by remember { mutableStateOf(false) }
    val transition = updateTransition(isSelected, label = "selected state")

    val cardColor by transition.animateColor(label = "",
        targetValueByState = {
            if (it) White else Color.Transparent
        }
    )
    val cardElevation by transition.animateDp(label = "",
        targetValueByState = {
            if (it) 2.dp else 0.dp
        }
    )
        TextButton(
            onClick = onClick,
        ) {
            Card(
                onClick = { isSelected = !isSelected },
                elevation = CardDefaults.cardElevation(cardElevation),
                colors = CardDefaults.cardColors(cardColor),
                shape = RoundedCornerShape(100.dp)
            ) {
            Text(
                text = text, fontSize = 20.sp,
                color = Color.Black,
                fontWeight = FontWeight.Normal,
                modifier = modifier.padding(8.dp)
            )
        }
    }
}