package es.yeffry.valorantapi.domain.usecase.maps

import es.yeffry.valorantapi.domain.entities.Map
import es.yeffry.valorantapi.domain.repository.MapsRepositoryInterface
import javax.inject.Inject

class MapsUseCaseImpl @Inject constructor(private val repository: MapsRepositoryInterface) : MapsUseCaseInterface {
    override suspend fun getMaps(): List<Map>? {
        return repository.getMaps()
    }
}