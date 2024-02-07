package es.yeffry.valorantapi.domain.entities

data class Map(
    val displayIcon: String,
    val displayName: String,
    val listViewIcon: String,
    val mapUrl: String,
    val narrativeDescription: String,
    val premierBackgroundImage: String,
    val stylizedBackgroundImage: String,
    val tacticalDescription: String,
    val uuid: String
)