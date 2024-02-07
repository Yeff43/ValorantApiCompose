package es.yeffry.valorantapi.domain.usecase.weapons

import es.yeffry.valorantapi.domain.entities.Weapon

interface WeaponsUseCaseInterface {

    suspend fun getWeapons(): List<Weapon>?

}