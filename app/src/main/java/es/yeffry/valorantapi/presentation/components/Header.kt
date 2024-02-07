package es.yeffry.valorantapi.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import es.yeffry.valorantapi.R

@Composable
fun Header(title: String) {
    Text(
        text = title,
        fontSize = 50.sp,
        fontFamily = FontFamily(Font(R.font.valorant_font)),
        fontStyle = FontStyle.Normal,
        color = Color.White,
        modifier = Modifier
            .padding(0.dp, 24.dp, 0.dp)
            .fillMaxWidth(),
        textAlign = TextAlign.Center
    )
}