package com.example.codelab1.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
public fun Greeting(name: String, from : String, modifier: Modifier = Modifier) {
    Column{
        Text(
            text = "from $from",
            modifier = modifier,
            fontSize = 20.sp,
            lineHeight = 56.sp,
        )
        Text(
            text = "Hello $name!",
            modifier = modifier,
            fontSize = 100.sp,
            lineHeight = 116.sp,
        )
    }
}