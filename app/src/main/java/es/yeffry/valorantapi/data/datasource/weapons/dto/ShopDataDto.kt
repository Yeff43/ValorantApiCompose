package es.yeffry.valorantapi.data.datasource.weapons.dto

data class ShopDataDto(
    val assetPath: String,
    val canBeTrashed: Boolean,
    val category: String,
    val categoryText: String,
    val cost: Int,
    val image: String?,
    val newImage: String,
    val newImage2: String?,
    val shopOrderPriority: Int
)