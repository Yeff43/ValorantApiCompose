package es.yeffry.valorantapi.data.datasource.weapons

import es.yeffry.valorantapi.data.datasource.weapons.dto.WeaponDto

interface WeaponsDataSourceInterface {

    suspend fun getWeapons(): List<WeaponDto>?
}