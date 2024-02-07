package es.yeffry.valorantapi.navigation

sealed class AppScreens(val route: String) {
    data object HomeScreen: AppScreens("valorant")
    data object AgentsScreen: AppScreens("agents")
    data object WeaponsScreen: AppScreens("weapons")
    data object MapsScreen: AppScreens("maps")
    data object CurrenciesScreen: AppScreens("currencies")
}