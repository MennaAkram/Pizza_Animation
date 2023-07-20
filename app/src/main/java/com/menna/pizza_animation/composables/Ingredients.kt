package com.menna.pizza_animation.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.menna.pizza_animation.R
import com.menna.pizza_animation.pizza_app.PizzaUIState

@Composable
fun Ingredients(
    modifier: Modifier = Modifier,
    state: PizzaUIState
) {
    Column() {
        Text(
            text = stringResource(R.string.customize_your_pizza),
            color = Color.LightGray,
            fontSize = 14.sp,
            textAlign = TextAlign.Start,
            modifier = modifier.padding(16.dp)
        )
        Spacer(modifier = modifier.height(8.dp))
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(24.dp),
            contentPadding = PaddingValues(horizontal = 16.dp)
        ){
            items(5){
                IngredientItem(painter = painterResource(state.ingredients[it]))
            }
        }
    }

}