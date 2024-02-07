package es.yeffry.valorantapi.data.repository

import es.yeffry.valorantapi.data.datasource.weapons.WeaponsDataSourceInterface
import es.yeffry.valorantapi.data.datasource.weapons.dto.WeaponDto
import es.yeffry.valorantapi.di.Mock
import es.yeffry.valorantapi.domain.entities.Weapon
import es.yeffry.valorantapi.domain.repository.MapperInterface
import es.yeffry.valorantapi.domain.repository.WeaponsRepositoryInterface

class WeaponsRepositoryImpl(
    private val datasource: WeaponsDataSourceInterface,
    @Mock private val mockDataSource: WeaponsDataSourceInterface
) : WeaponsRepositoryInterface {

    private val mapperWeapons = object : MapperInterface<WeaponDto, Weapon> {
        override fun WeaponDto.toDomain(): Weapon {
            return Weapon(
                uuid = this.uuid,
                name = this.displayName,
                category = this.category,
                displayIcon = this.displayIcon,
                magazineSize = this.weaponStatsDto.magazineSize,
                cost = this.shopDataDto.cost
            )
        }
    }

    override suspend fun getWeapons(): List<Weapon>? {
        with(mapperWeapons) {
            val res = mockDataSource.getWeapons()
            return res?.map { it.toDomain() }
        }
    }
}