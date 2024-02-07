@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)

package es.yeffry.valorantapi.presentation.modules.weapons

import androidx.compose.foundation.background
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import es.yeffry.valorantapi.R
import es.yeffry.valorantapi.domain.entities.Map
import es.yeffry.valorantapi.presentation.components.CustomBottomBar
import es.yeffry.valorantapi.presentation.components.Header
import es.yeffry.valorantapi.presentation.components.SearchField
import es.yeffry.valorantapi.presentation.modules.maps.MapsViewModel

@Composable
fun MapsScreen(navController: NavHostController, viewModel: MapsViewModel) {
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
        topBar = {
            Header(
                title = navController.currentDestination?.route.toString().uppercase()
            )
        },
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

            Maps(
                viewModel.getFilteredMaps(query, uiState.maps),
                navController = navController
            )
        }
    }
}

@Composable
fun Maps(maps: List<Map>, navController: NavHostController) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(1),
        modifier = Modifier.padding(start = 16.dp, top = 24.dp, bottom = 8.dp, end = 16.dp)
    ) {
        items(maps) {
            CustomMapCard(map = it, navController)
        }
    }
}

@Composable
fun CustomMapCard(map: Map, navController: NavHostController) {
    Card(modifier = Modifier.padding(8.dp, 8.dp, 8.dp, 8.dp),
        onClick = {

        }) {
        Box(
            modifier = Modifier.background(Color.White)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                AsyncImage(
                    model = map.displayIcon,
                    contentScale = ContentScale.FillWidth,
                    contentDescription = "Weapon ${map.displayName}",
                    modifier = Modifier
                        .size(180.dp)
                        .padding(0.dp, 4.dp, 0.dp, 0.dp)
                )
                Text(
                    text = map.displayName.uppercase(),
                    modifier = Modifier
                        .width(180.dp)
                        .padding(8.dp),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color(android.graphics.Color.parseColor("#fd5d66")),
                    fontFamily = FontFamily(Font(R.font.valorant_font))
                )
            }
        }
    }
}