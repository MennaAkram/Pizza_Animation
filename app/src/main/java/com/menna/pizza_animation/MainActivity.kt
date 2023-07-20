package com.menna.pizza_animation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.menna.pizza_animation.pizza_app.PizzaApp
import com.menna.pizza_animation.ui.theme.Pizza_AnimationTheme
import com.menna.pizza_animation.ui.theme.White

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val systemUiController = rememberSystemUiController()
            systemUiController.setStatusBarColor(White, darkIcons = true)
            Pizza_AnimationTheme {
                PizzaApp()
            }
        }
    }
}