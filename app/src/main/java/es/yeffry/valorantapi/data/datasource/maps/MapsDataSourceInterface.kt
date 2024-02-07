package es.yeffry.valorantapi.data.datasource.maps

import es.yeffry.valorantapi.data.datasource.maps.dto.MapDto
import retrofit2.Response

interface MapsDataSourceInterface {

    suspend fun getMaps(): List<MapDto>?
}