package es.yeffry.valorantapi.data.datasource.maps.dto

data class MapDto(
    val assetPath: String,
    val calloutDtos: List<CalloutDto>,
    val coordinates: String,
    val displayIcon: String,
    val displayName: String,
    val listViewIcon: String,
    val listViewIconTall: String,
    val mapUrl: String,
    val narrativeDescription: String,
    val premierBackgroundImage: String,
    val splash: String,
    val stylizedBackgroundImage: String,
    val tacticalDescription: String,
    val uuid: String,
    val xMultiplier: Double,
    val xScalarToAdd: Double,
    val yMultiplier: Double,
    val yScalarToAdd: Double
)