package es.yeffry.valorantapi.data.datasource.currencies.dto

data class CurrencyDto(
    val assetPath: String,
    val displayIcon: String,
    val displayName: String,
    val displayNameSingular: String,
    val largeIcon: String,
    val uuid: String
)