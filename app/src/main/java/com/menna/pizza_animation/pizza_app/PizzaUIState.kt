package com.menna.pizza_animation.pizza_app

import com.menna.pizza_animation.R

data class PizzaUIState(
    val plate: Int = R.drawable.plate,
    val basil: List<Int> = listOf(
        R.drawable.basil_1,R.drawable.basil_2,R.drawable.basil_3,
        R.drawable.basil_4,R.drawable.basil_5,R.drawable.basil_6,
        R.drawable.basil_7,R.drawable.basil_8,R.drawable.basil_9,
        R.drawable.basil_10
    ),
    val bread: List<Int> = listOf(
        R.drawable.bread_1,R.drawable.bread_2,R.drawable.bread_3,
        R.drawable.bread_4,R.drawable.bread_5
    ),
    val broccoli: List<Int> = listOf(
        R.drawable.broccoli_1,R.drawable.broccoli_2,
        R.drawable.broccoli_3,R.drawable.broccoli_4,
        R.drawable.broccoli_5,R.drawable.broccoli_6,
        R.drawable.broccoli_7,R.drawable.broccoli_8,
        R.drawable.broccoli_9,R.drawable.broccoli_10
    ),
    val mushroom: List<Int> = listOf(
        R.drawable.mushroom_1,R.drawable.mushroom_2,
        R.drawable.mushroom_3,R.drawable.mushroom_4,
        R.drawable.mushroom_5,R.drawable.mushroom_6,
        R.drawable.mushroom_7,R.drawable.mushroom_8,
        R.drawable.mushroom_9,R.drawable.mushroom_10
    ),
    val onion: List<Int> = listOf(
        R.drawable.onion_1,R.drawable.onion_2,R.drawable.onion_3,
        R.drawable.onion_4,R.drawable.onion_5,R.drawable.onion_6,
        R.drawable.onion_7,R.drawable.onion_8,R.drawable.onion_9,
        R.drawable.onion_10
    ),
    val sausage: List<Int> = listOf(
        R.drawable.sausage_1,R.drawable.sausage_2,
        R.drawable.sausage_3,R.drawable.sausage_4,
        R.drawable.sausage_5,R.drawable.sausage_6,
        R.drawable.sausage_7,R.drawable.sausage_8,
        R.drawable.sausage_9,R.drawable.sausage_10
    ),
    val price: String = "$17",
    val size: List<String> = listOf(" S ", " M ", " L "),
    val ingredients: List<Int> = listOf(
        R.drawable.basil_3,R.drawable.onion_3,
        R.drawable.broccoli_3,R.drawable.mushroom_3,
        R.drawable.sausage_3
    ),
    val imageIngredient: List<Int> = listOf(
        R.drawable.basils,
        R.drawable.broccoli,
        R.drawable.onions,
        R.drawable.sausage,
        R.drawable.mushroom,
    )
)

sealed class Sizes(val scale: Float){
    object Small: Sizes(0.5f)
    object Medium: Sizes(0.6f)
    object Large: Sizes(0.7f)
}

enum class Ingredients{
    BASIL, ONION, BROCCOLI, MUSHROOM, SAUSAGE
}
