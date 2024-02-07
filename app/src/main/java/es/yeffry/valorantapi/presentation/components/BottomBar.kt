package es.yeffry.valorantapi.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CustomBottomBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Red),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.End,
    ) {
        Text(
            text = "By Yeffry R.", color = Color.White,
            modifier = Modifier.padding(0.dp, 0.dp, 16.dp, 4.dp)
        )
    }
}