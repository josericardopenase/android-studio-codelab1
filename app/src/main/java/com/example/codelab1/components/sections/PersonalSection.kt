package com.example.codelab1.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.codelab1.components.cards.ProfilePictureCard
import com.example.codelab1.ui.theme.PoppinsFamily

@Composable
public fun PersonalSection() {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Text(
            text = "Hello fellow 👋",
            fontSize = 21.sp,
            lineHeight = 56.sp,
            fontFamily =  PoppinsFamily,
            color = Color(87, 87, 87),
            modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 20.dp)

        )
        ProfilePictureCard()
        Text(
            text = "My name is",
            fontSize = 20.sp,
            lineHeight = 56.sp,
            fontFamily =  PoppinsFamily,
            color = Color(87, 87, 87),
            modifier = Modifier.padding(0.dp, 10.dp, 0.dp, 10.dp)
        )
        Text(
            text = "Pepe Peña Seco",
            fontSize = 30.sp,
            lineHeight = 56.sp,
            fontFamily =  PoppinsFamily,
            fontWeight = FontWeight.SemiBold,
            color = Color(107, 55, 255)

        )
        Text(
            textAlign = TextAlign.Justify,
            text = "I am a software and product development enthusiast. My passion is to create high impact products that solve real problems in an easy and intuitive way. Programming is a means to a single end, to provide value.",
            fontSize = 15.sp,
            fontFamily =  PoppinsFamily,
            color = Color(108, 108, 108),
            modifier = Modifier.padding(10.dp, 10.dp, 0.dp, 0.dp)
        )
    }
}
