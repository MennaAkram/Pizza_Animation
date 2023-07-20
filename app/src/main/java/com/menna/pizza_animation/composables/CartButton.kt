package com.menna.pizza_animation.composables

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.menna.pizza_animation.R
import com.menna.pizza_animation.ui.theme.Brown
import com.menna.pizza_animation.ui.theme.White

@Composable
fun CartButton(modifier: Modifier = Modifier) {
    Button(onClick = {  },
        modifier = modifier
            .padding(vertical = 24.dp, horizontal = 115.dp)
            .fillMaxWidth()
            .height(42.dp),
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(Brown)
    ) {
        Icon(
            painter = painterResource(R.drawable.baseline_shopping_cart_24),
            contentDescription = "",
            modifier = modifier.padding(horizontal = 8.dp),
            tint = White
        )
        Text(text = stringResource(R.string.add_to_cart), color = White)
    }
}