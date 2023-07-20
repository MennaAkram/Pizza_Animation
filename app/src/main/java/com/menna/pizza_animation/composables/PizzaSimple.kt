package com.menna.pizza_animation.composables

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.menna.pizza_animation.pizza_app.PizzaUIState

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PizzaSimple(
    modifier: Modifier = Modifier,
    state: PizzaUIState,
) {
    val pagerState = rememberPagerState()

    Box(
        modifier = modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(state.plate),
            contentDescription = "" ,
            modifier = modifier.padding(horizontal = 48.dp, vertical = 32.dp)
        )
        HorizontalPager(
            modifier = modifier,
            state = pagerState,
            pageCount = 5,
            contentPadding = PaddingValues(horizontal = 64.dp),
            pageSpacing = 64.dp,
        ) {
                Image(
                    painter = painterResource(state.bread[it]),
                    contentDescription = "",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    contentScale = ContentScale.Fit
                )
        }
    }
}