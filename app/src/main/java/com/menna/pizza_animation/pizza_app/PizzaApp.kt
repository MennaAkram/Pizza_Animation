package com.menna.pizza_animation.pizza_app

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.menna.pizza_animation.R
import com.menna.pizza_animation.composables.AppBar
import com.menna.pizza_animation.composables.CartButton
import com.menna.pizza_animation.composables.Ingredients
import com.menna.pizza_animation.composables.PizzaSimple
import com.menna.pizza_animation.composables.PizzaSize
import com.menna.pizza_animation.ui.theme.Brown
import com.menna.pizza_animation.ui.theme.White

@Composable
fun PizzaApp(
    modifier: Modifier = Modifier,
    state: PizzaUIState = PizzaUIState(),
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        AppBar()
        PizzaSimple(state = state)
        Text(text = state.price, fontSize = 24.sp, fontWeight = FontWeight.SemiBold)
        Spacer(modifier = modifier.height(8.dp))
        PizzaSize(state = state)
        Ingredients(state = state)
        Spacer(modifier = modifier.weight(1f))
        CartButton()
    }
}

@Preview
@Composable
fun previewApp() {
// PizzaApp()
}