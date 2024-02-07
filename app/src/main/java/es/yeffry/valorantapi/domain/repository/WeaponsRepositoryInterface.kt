package es.yeffry.valorantapi.domain.repository

import es.yeffry.valorantapi.domain.entities.Weapon

interface WeaponsRepositoryInterface {

    suspend fun getWeapons(): List<Weapon>?
}