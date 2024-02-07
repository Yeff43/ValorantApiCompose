package es.yeffry.valorantapi.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import es.yeffry.valorantapi.presentation.modules.agents.AgentsScreen
import es.yeffry.valorantapi.presentation.modules.agents.AgentsViewModel
import es.yeffry.valorantapi.presentation.modules.currencies.CeremoniesScreen
import es.yeffry.valorantapi.presentation.modules.currencies.CurrenciesViewModel
import es.yeffry.valorantapi.presentation.modules.home.HomeScreen
import es.yeffry.valorantapi.presentation.modules.home.HomeViewModel
import es.yeffry.valorantapi.presentation.modules.maps.MapsViewModel
import es.yeffry.valorantapi.presentation.modules.weapons.MapsScreen
import es.yeffry.valorantapi.presentation.modules.weapons.WeaponsScreen
import es.yeffry.valorantapi.presentation.modules.weapons.WeaponsViewModel

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = AppScreens.HomeScreen.route) {
        composable(route = AppScreens.HomeScreen.route) {
            HomeScreen(navController, hiltViewModel<HomeViewModel>())
        }

        composable(route = AppScreens.AgentsScreen.route) {
            AgentsScreen(navController, hiltViewModel<AgentsViewModel>())
        }

        composable(route = AppScreens.WeaponsScreen.route) {
            WeaponsScreen(navController, hiltViewModel<WeaponsViewModel>())
        }

        composable(route = AppScreens.MapsScreen.route) {
            MapsScreen(navController, hiltViewModel<MapsViewModel>())
        }

        composable(route = AppScreens.CurrenciesScreen.route) {
            CeremoniesScreen(navController, hiltViewModel<CurrenciesViewModel>())
        }
    }

}