package es.yeffry.valorantapi.domain.usecase.weapons

import es.yeffry.valorantapi.domain.entities.Weapon
import es.yeffry.valorantapi.domain.repository.WeaponsRepositoryInterface
import javax.inject.Inject

class WeaponsUseCaseImpl @Inject constructor(private val repository: WeaponsRepositoryInterface): WeaponsUseCaseInterface {
    override suspend fun getWeapons(): List<Weapon>? {
        return repository.getWeapons()
    }
}