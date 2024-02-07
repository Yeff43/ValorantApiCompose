package es.yeffry.valorantapi.data.datasource.weapons.dto

data class WeaponStatsDto(
    val adsStats: AdsStatsDto,
    val altFireType: String,
    val feature: String?,
    val fireRate: String,
    val magazineSize: Int,
    val wallPenetration: String
)