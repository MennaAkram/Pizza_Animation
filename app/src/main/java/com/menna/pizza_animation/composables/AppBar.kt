package com.menna.pizza_animation.composables

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.menna.pizza_animation.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun AppBar(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.fillMaxWidth().padding(16.dp)
    ) {
                IconButton(onClick = { },) {
                    Icon(
                        painter = painterResource(R.drawable.baseline_arrow_back_24),
                        contentDescription ="",
                    )
                }

                Text(text = "Pizza",)

                IconButton(onClick = { },) {
                    Icon(
                        painter = painterResource(R.drawable.baseline_favorite_24),
                        contentDescription ="",
                    )
                }
            }
}