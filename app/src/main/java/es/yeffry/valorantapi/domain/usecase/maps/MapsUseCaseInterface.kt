package es.yeffry.valorantapi.domain.usecase.maps

import es.yeffry.valorantapi.domain.entities.Map

interface MapsUseCaseInterface {

    suspend fun getMaps(): List<Map>?
}