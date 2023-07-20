package com.menna.pizza_animation.composables

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.menna.pizza_animation.pizza_app.PizzaUIState
import com.menna.pizza_animation.pizza_app.Sizes
import com.menna.pizza_animation.ui.theme.White

@Composable
fun PizzaSize(
    modifier: Modifier = Modifier,
    state: PizzaUIState,
) {
    var isSelected by remember { mutableStateOf(false) }
    val transition = updateTransition(
        targetState = isSelected, label = "",)
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
    Box() {
        Card(
            elevation = CardDefaults.cardElevation(cardElevation),
            colors = CardDefaults.cardColors(cardColor),
            shape = RoundedCornerShape(100.dp),
//            modifier = Modifier
//                .size(50.dp).clip(CircleShape)
//                .background(cardColor)
//                .align(Alignment.Center),
        ) {}

        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier.padding(24.dp)
        ) {
            Text(
                text = state.size[0], fontSize = 20.sp,
                fontWeight = FontWeight.Normal,
                modifier = modifier
                    .padding(8.dp)
                    .clickable(indication = null,
                        interactionSource = remember { MutableInteractionSource() }
                    ) { Sizes.Small }
            )
            Text(
                text = state.size[1], fontSize = 20.sp,
                fontWeight = FontWeight.Normal,
                modifier = modifier
                    .padding(8.dp)
                    .clickable(indication = null,
                        interactionSource = remember { MutableInteractionSource() }
                    ) { Sizes.Medium }
            )
            Text(
                text = state.size[2], fontSize = 20.sp,
                fontWeight = FontWeight.Normal,
                modifier = modifier
                    .padding(8.dp)
                    .clickable(indication = null,
                        interactionSource = remember { MutableInteractionSource() }
                    ) { Sizes.Large }
            )
        }
    }
}

@Composable
fun SizeItem(
    modifier: Modifier = Modifier,
    text: String,
) {
    var selected by remember { mutableStateOf(false) }
// Animates changes when `selected` is changed.
    val transition = updateTransition(selected, label = "selected state")
    val borderColor by transition.animateColor(label = "border color") { isSelected ->
        if (isSelected) Color.Magenta else Color.White
    }
    val elevation by transition.animateDp(label = "elevation") { isSelected ->
        if (isSelected) 10.dp else 2.dp
    }

//    var isSelected by remember { mutableStateOf(false) }
//    val transition = updateTransition(
//        targetState = isSelected, label = "",)
//    val cardColor by transition.animateColor(label = "",
//        targetValueByState = {
//            if (it) White else Color.Transparent
//        }
//    )
//    val cardElevation by transition.animateDp(label = "",
//        targetValueByState = {
//            if (it) 2.dp else 0.dp
//        }
//    )
//    val indicatorLeft by transition.animateDp(label = "Indicator left") {
//
//    }
//    val indicatorRight by transition.animateDp(label = "Indicator right") {
//        tabPositions[page.ordinal].right
//    }
//    val color by transition.animateColor(label = "Border color") {
//        if (page == TabPage.Home) Purple700 else Green800
//    }
//    var currentState by remember { mutableStateOf(Sizes.Medium) }
//    val transition = updateTransition(currentState, label = "state")
//    val rect by transition.animateRect(label = "rectangle") { state ->
//        when (state) {
//              Sizes.Medium -> Rect(100f, 100f, 300f, 300f)
//          is  Sizes.Small -> Rect(0f, 0f, 100f, 100f)
//          is  Sizes.Large -> Rect(200f, 200f, 500f, 500f)
//        }
//    }
//    val color by transition.animateColor(
//        transitionSpec = {
//            when {
//                BoxState.Expanded isTransitioningTo BoxState.Collapsed ->
//                    spring(stiffness = 50f)
//                else ->
//                    tween(durationMillis = 500)
//            }
//        }, label = "color"
//    ) { state ->
//        when (state) {
//            BoxState.Collapsed -> MaterialTheme.colorScheme.primary
//            BoxState.Expanded -> MaterialTheme.colorScheme.background
//        }
//    }

//
//    Card(
//        onClick = { isSelected = !isSelected },
//        elevation = CardDefaults.cardElevation(cardElevation),
//        colors = CardDefaults.cardColors(cardColor),
//        shape = RoundedCornerShape(100.dp)
//    ) {
//        Text(
//            text = text, fontSize = 20.sp,
//            fontWeight = FontWeight.Normal,
//            modifier = modifier.padding(8.dp)
//        )
//    }
//    AnimatedVisibility(
//        visible = isSelected,
////        enter = ,
////        modifier = Modifier.fillMaxWidth()
//    ) {
//
//    }
}