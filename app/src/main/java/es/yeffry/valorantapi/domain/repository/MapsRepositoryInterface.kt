package es.yeffry.valorantapi.domain.repository

import es.yeffry.valorantapi.domain.entities.Map

interface MapsRepositoryInterface {

    suspend fun getMaps(): List<Map>?
}