package es.yeffry.valorantapi.data.datasource.weapons.remote

import es.yeffry.valorantapi.data.datasource.weapons.WeaponsDataSourceInterface
import es.yeffry.valorantapi.data.datasource.weapons.dto.WeaponDto
import es.yeffry.valorantapi.data.datasource.currencies.remote.api.CurrenciesApi
import es.yeffry.valorantapi.data.datasource.weapons.remote.api.WeaponsApi
import es.yeffry.valorantapi.manager.network.NetworkManager

class WeaponsDataSourceImpl(
    private val api: WeaponsApi,
    private val networkManager: NetworkManager
) : WeaponsDataSourceInterface {
    override suspend fun getWeapons(): List<WeaponDto>? {
        val res = networkManager.load { api.getWeapons() }
        return res.getOrThrow()
    }
}