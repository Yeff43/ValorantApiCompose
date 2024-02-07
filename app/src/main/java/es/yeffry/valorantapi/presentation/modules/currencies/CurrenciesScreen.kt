@file:OptIn(ExperimentalMaterial3Api::class)

package es.yeffry.valorantapi.presentation.modules.currencies

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import es.yeffry.valorantapi.R
import es.yeffry.valorantapi.domain.entities.Currency
import es.yeffry.valorantapi.domain.entities.Weapon
import es.yeffry.valorantapi.presentation.components.CustomBottomBar
import es.yeffry.valorantapi.presentation.components.Header
import es.yeffry.valorantapi.presentation.components.SearchField

@Composable
fun CeremoniesScreen(navController: NavHostController, viewModel: CurrenciesViewModel) {
    val uiState = viewModel.uiState.collectAsState().value
    var query by remember { mutableStateOf("") }


    SearchField(
        query = query,
        onQueryChange = { query = it },
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp, 12.dp, 16.dp, 0.dp)
    )


    Scaffold(
        topBar = { Header(title = "WEAPONS") },
        bottomBar = { CustomBottomBar() },
        modifier = Modifier.fillMaxSize(),
        containerColor = Color.Black
    ) {
        Column(modifier = Modifier.padding(it)) {
            it.calculateTopPadding()

            SearchField(
                query = query,
                onQueryChange = { query = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp, 12.dp, 16.dp, 0.dp)
            )

            Weapons(
                viewModel.getFilteredCurrencies(query, uiState.currencies),
                navController = navController
            )
        }
    }
}

@Composable
fun Weapons(weapons: List<Currency>, navController: NavHostController) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(1),
        modifier = Modifier.padding(start = 16.dp, top = 24.dp, bottom = 8.dp, end = 16.dp)
    ) {
        items(weapons) {
            CustomCurrencyCard(currency = it, navController)
        }
    }
}

@Composable
fun CustomCurrencyCard(currency: Currency, navController: NavHostController) {
        Card(modifier = Modifier.padding(8.dp, 8.dp, 8.dp, 8.dp).clickable(enabled = false){}.focusable(enabled = false),
        onClick = {

        }) {
        Box(
            modifier = Modifier.background(Color(android.graphics.Color.parseColor("#5b69ff")))
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                AsyncImage(
                    model = currency.displayIcon,
                    contentScale = ContentScale.Fit,
                    contentDescription = "Weapon ${currency.displayName}",
                    modifier = Modifier
                        .size(180.dp)
                        .padding(0.dp, 8.dp, 0.dp, 0.dp)
                )
                Text(
                    text = currency.displayNameSingular.uppercase(),
                    modifier = Modifier
                        .width(180.dp)
                        .padding(8.dp),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color(android.graphics.Color.parseColor("#6ceed8")),
                    fontFamily = FontFamily(Font(R.font.valorant_font))
                )
            }
        }
    }
}