package com.example.codelab1.components.cards

import android.view.RoundedCorner
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.codelab1.R

@Composable
public fun ProfilePictureCard() {
    Image(
        painter = painterResource(id = R.drawable.profile_picture),
        contentDescription = "Profile picture of pepe",
        modifier = Modifier.clip(CircleShape).height(170.dp).width(170.dp)
    )
}
