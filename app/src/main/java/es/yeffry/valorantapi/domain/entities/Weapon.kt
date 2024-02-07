package es.yeffry.valorantapi.domain.entities

data class Weapon(
    val uuid: String = "",
    val name: String = "",
    val category: String = "",
    val displayIcon: String = "",
    val magazineSize: Int = 0,
    val cost: Int = 0
)