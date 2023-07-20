package com.menna.pizza_animation.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.menna.pizza_animation.R
import com.menna.pizza_animation.pizza_app.PizzaUIState
import com.menna.pizza_animation.ui.theme.Blue

@OptIn(ExperimentalMaterial3Api::class)
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