package com.example.codelab1.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.codelab1.ui.theme.PoppinsFamily

@Composable
public fun ContactSection() {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = "let's talk",
            fontSize = 20.sp,
            lineHeight = 56.sp,
            fontFamily =  PoppinsFamily,
            fontWeight = FontWeight.SemiBold,
            color = Color(110 , 110, 110),
        )
        Text(
            text = "example@gmail.com",
            fontSize = 15.sp,
            fontFamily =  PoppinsFamily,
            fontWeight = FontWeight.Medium,
            color = Color(87, 87, 87),
        )
        Text(
            text = "+34 123 234 456",
            fontSize = 15.sp,
            fontFamily =  PoppinsFamily,
            fontWeight = FontWeight.Medium,
            color = Color(87, 87, 87),
        )
    }
}
