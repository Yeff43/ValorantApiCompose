package es.yeffry.valorantapi.data.datasource.maps.remote

import es.yeffry.valorantapi.data.datasource.maps.MapsDataSourceInterface
import es.yeffry.valorantapi.data.datasource.maps.dto.MapDto
import es.yeffry.valorantapi.data.datasource.maps.remote.api.MapsApi
import es.yeffry.valorantapi.manager.network.NetworkManager

class MapsDataSourceImpl(private val api: MapsApi, private val networkManager: NetworkManager): MapsDataSourceInterface {
    override suspend fun getMaps(): List<MapDto>? {
        val res = networkManager.load { api.getMaps() }
        return res.getOrThrow()
    }
}