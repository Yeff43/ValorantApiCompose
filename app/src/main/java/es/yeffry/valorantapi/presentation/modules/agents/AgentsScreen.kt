@file:OptIn(ExperimentalMaterial3Api::class)

package es.yeffry.valorantapi.presentation.modules.agents

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
import androidx.compose.ui.graphics.Brush
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
import es.yeffry.valorantapi.domain.entities.Agent
import es.yeffry.valorantapi.presentation.components.CustomBottomBar
import es.yeffry.valorantapi.presentation.components.Header
import es.yeffry.valorantapi.presentation.components.SearchField

@Composable
fun AgentsScreen(navController: NavHostController, agentsViewModel: AgentsViewModel) {
    val uiState = agentsViewModel.uiState.collectAsState().value
    var query by remember { mutableStateOf("") }

    Scaffold(
        topBar = { Header(title = navController.currentDestination?.route.toString().uppercase()) },
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

            Agents(agentsViewModel.getFilteredList(query, uiState.agents), navController = navController)
        }
    }
}

@Composable
fun Agents(agents: List<Agent>?, navController: NavHostController) {
    agents?.let {
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier.padding(start = 16.dp, top = 24.dp, bottom = 8.dp, end = 16.dp)
        ) {
            items(agents) { agent ->
                CustomAgentCard(agent = agent, navController)
            }
        }
    }
}

@Composable
fun CustomAgentCard(agent: Agent, navController: NavHostController) {
    val brushColors: ArrayList<Color> = arrayListOf()
    agent.backgroundGradientColors.forEachIndexed { _, color ->
        brushColors.add(Color(android.graphics.Color.parseColor("#$color")))
    }
    Card(modifier = Modifier.padding(8.dp, 8.dp, 8.dp, 8.dp),
        onClick = {

        }) {
        Box(
            modifier = Modifier.background(brush = Brush.verticalGradient(colors = brushColors)),
        ) {
            Column(
                verticalArrangement = Arrangement.SpaceAround,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                AsyncImage(
                    model = agent.fullPortrait,
                    contentScale = ContentScale.Crop,
                    contentDescription = "Agent ${agent.displayName}",
                    modifier = Modifier
                        .size(180.dp)
                        .padding(0.dp, 8.dp, 0.dp, 0.dp)
                )
                Text(
                    text = agent.displayName.uppercase(),
                    modifier = Modifier
                        .width(180.dp)
                        .padding(8.dp),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color(android.graphics.Color.parseColor("#5b69ff")),//#fd5d66
                    fontFamily = FontFamily(Font(R.font.valorant_font))
                )
            }
        }
    }
}