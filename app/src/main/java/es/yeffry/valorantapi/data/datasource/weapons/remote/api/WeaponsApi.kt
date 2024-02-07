package es.yeffry.valorantapi.data.datasource.weapons.remote.api

import es.yeffry.valorantapi.data.datasource.weapons.dto.WeaponDto
import retrofit2.Response
import retrofit2.http.GET

interface WeaponsApi {

    @GET("/v1/weapons")
    suspend fun getWeapons(): Response<List<WeaponDto>>
}