package es.yeffry.valorantapi.data.datasource.weapons.dto

data class WeaponDto(
    val assetPath: String,
    val category: String,
    val defaultSkinUuid: String,
    val displayIcon: String,
    val displayName: String,
    val killStreamIcon: String,
    val shopDataDto: ShopDataDto,
    val uuid: String,
    val weaponStatsDto: WeaponStatsDto
)