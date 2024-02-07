package es.yeffry.valorantapi.data.repository

import es.yeffry.valorantapi.data.datasource.maps.MapsDataSourceInterface
import es.yeffry.valorantapi.data.datasource.maps.dto.MapDto
import es.yeffry.valorantapi.data.datasource.weapons.WeaponsDataSourceInterface
import es.yeffry.valorantapi.data.datasource.weapons.dto.WeaponDto
import es.yeffry.valorantapi.di.Mock
import es.yeffry.valorantapi.domain.entities.Map
import es.yeffry.valorantapi.domain.entities.Weapon
import es.yeffry.valorantapi.domain.repository.MapperInterface
import es.yeffry.valorantapi.domain.repository.MapsRepositoryInterface
import es.yeffry.valorantapi.domain.repository.WeaponsRepositoryInterface

class MapsRepositoryImpl(
    private val datasource: MapsDataSourceInterface,
    @Mock private val mockDataSource: MapsDataSourceInterface
) : MapsRepositoryInterface {

    private val mapsMapper = object : MapperInterface<MapDto, Map> {
        override fun MapDto.toDomain(): Map {
            return Map(
                displayIcon,
                displayName,
                listViewIcon,
                mapUrl,
                narrativeDescription,
                premierBackgroundImage,
                stylizedBackgroundImage,
                tacticalDescription,
                uuid
            )
        }
    }

    override suspend fun getMaps(): List<Map>? {
        with(mapsMapper) {
            val res = mockDataSource.getMaps()
            return res?.map { it.toDomain() }
        }
    }
}