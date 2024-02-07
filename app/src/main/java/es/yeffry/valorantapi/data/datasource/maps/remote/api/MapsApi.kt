package es.yeffry.valorantapi.data.datasource.maps.remote.api

import es.yeffry.valorantapi.data.datasource.maps.dto.MapDto
import retrofit2.Response
import retrofit2.http.GET

interface MapsApi {

    @GET("/v1/maps")
    suspend fun getMaps(): Response<List<MapDto>?>
}