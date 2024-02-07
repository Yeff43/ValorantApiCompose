package es.yeffry.valorantapi.data.datasource.weapons.mock

import es.yeffry.valorantapi.data.datasource.weapons.WeaponsDataSourceInterface
import es.yeffry.valorantapi.data.datasource.weapons.dto.AdsStatsDto
import es.yeffry.valorantapi.data.datasource.weapons.dto.ShopDataDto
import es.yeffry.valorantapi.data.datasource.weapons.dto.WeaponDto
import es.yeffry.valorantapi.data.datasource.weapons.dto.WeaponStatsDto

class WeaponsMockDataSourceImpl : WeaponsDataSourceInterface {
    override suspend fun getWeapons(): List<WeaponDto>? {
        return listOf(
            WeaponDto(
                assetPath = "ShooterGame/Content/Equippables/Guns/HvyMachineGuns/HMG/HMGPrimaryAsset",
                category = "EEquippableCategory::Heavy",
                defaultSkinUuid = "f454efd1-49cb-372f-7096-d394df615308",
                displayIcon = "https://media.valorant-api.com/weapons/63e6c2b6-4a8e-869c-3d4c-e38355226584/displayicon.png",
                displayName = "Odin",
                killStreamIcon = "https://media.valorant-api.com/weapons/63e6c2b6-4a8e-869c-3d4c-e38355226584/killstreamicon.png",
                shopDataDto = ShopDataDto(
                    cost = 3200,
                    category = "Heavy Weapons",
                    shopOrderPriority = 0,
                    categoryText = "Heavy Weapons",
                    canBeTrashed = true,
                    image = null,
                    newImage = "https://media.valorant-api.com/weapons/63e6c2b6-4a8e-869c-3d4c-e38355226584/shop/newimage.png",
                    newImage2 = null,
                    assetPath = "ShooterGame/Content/Equippables/Guns/HvyMachineGuns/HMG/HeavyMachineGunPurchase"
                ),
                uuid = "63e6c2b6-4a8e-869c-3d4c-e38355226584",
                weaponStatsDto = WeaponStatsDto(
                    fireRate = "12",
                    magazineSize = 100,
                    wallPenetration = "EWallPenetrationDisplayType::High",
                    feature = "EWeaponStatsFeature::ROFIncrease",
                    altFireType = "EWeaponAltFireDisplayType::ADS",
                    adsStats = AdsStatsDto(
                        zoomMultiplier = 1.15,
                        fireRate = 15.6,
                        runSpeedMultiplier = 0.76,
                        burstCount = 1,
                        firstBulletAccuracy = 0.79
                    ),
                )
            ),
            WeaponDto(
                assetPath = "ShooterGame/Content/Equippables/Guns/HvyMachineGuns/LMG/LMGPrimaryAsset",
                category = "EEquippableCategory::Heavy",
                defaultSkinUuid = "5305d9c4-4f46-fbf4-9e9a-dea772c263b5",
                displayIcon = "https://media.valorant-api.com/weapons/55d8a0f4-4274-ca67-fe2c-06ab45efdf58/displayicon.png",
                displayName = "Ares",
                killStreamIcon = "https://media.valorant-api.com/weapons/55d8a0f4-4274-ca67-fe2c-06ab45efdf58/killstreamicon.png",
                shopDataDto = ShopDataDto(
                    cost = 1600,
                    category = "Heavy Weapons",
                    shopOrderPriority = 0,
                    categoryText = "Heavy Weapons",
                    canBeTrashed = true,
                    image = null,
                    newImage = "https://media.valorant-api.com/weapons/55d8a0f4-4274-ca67-fe2c-06ab45efdf58/shop/newimage.png",
                    newImage2 = null,
                    assetPath = "ShooterGame/Content/Equippables/Guns/HvyMachineGuns/LMG/LightMachineGunPurchase"
                ),
                uuid = "55d8a0f4-4274-ca67-fe2c-06ab45efdf58",
                weaponStatsDto = WeaponStatsDto(
                    fireRate = "13",
                    magazineSize = 50,
                    wallPenetration = "EWallPenetrationDisplayType::High",
                    feature = null,
                    altFireType = "EWeaponAltFireDisplayType::ADS",
                    adsStats = AdsStatsDto(
                        zoomMultiplier = 1.15,
                        fireRate = 13.0,
                        runSpeedMultiplier = 0.76,
                        burstCount = 1,
                        firstBulletAccuracy = 0.9
                    )
                )
            ),
            WeaponDto(
                assetPath = "ShooterGame/Content/Equippables/Guns/Rifles/AK/AKPrimaryAsset",
                category = "EEquippableCategory::Rifle",
                defaultSkinUuid = "27f21d97-4c4b-bd1c-1f08-31830ab0be84",
                displayIcon = "https://media.valorant-api.com/weapons/9c82e19d-4575-0200-1a81-3eacf00cf872/displayicon.png",
                displayName = "Vandal",
                killStreamIcon = "https://media.valorant-api.com/weapons/9c82e19d-4575-0200-1a81-3eacf00cf872/killstreamicon.png",
                shopDataDto = ShopDataDto(
                    cost = 2900,
                    category = "Rifles",
                    shopOrderPriority = 0,
                    categoryText = "Assault Rifles",
                    canBeTrashed = true,
                    image = null,
                    newImage = "https://media.valorant-api.com/weapons/9c82e19d-4575-0200-1a81-3eacf00cf872/shop/newimage.png",
                    newImage2 = null,
                    assetPath = "ShooterGame/Content/Equippables/Guns/Rifles/AK/AK47WeaponPurchase"
                ),
                uuid = "9c82e19d-4575-0200-1a81-3eacf00cf872",
                weaponStatsDto = WeaponStatsDto(
                    fireRate = "9.75",
                    magazineSize = 25,
                    wallPenetration = "EWallPenetrationDisplayType::Medium",
                    feature = null,
                    altFireType = "EWeaponAltFireDisplayType::ADS",
                    adsStats = AdsStatsDto(
                        zoomMultiplier = 1.25,
                        fireRate = 8.775,
                        runSpeedMultiplier = 0.76,
                        burstCount = 1,
                        firstBulletAccuracy = 0.1575
                    )
                )
            ),
            WeaponDto(
                assetPath = "ShooterGame/Content/Equippables/Guns/Rifles/Burst/BurstPrimaryAsset",
                category = "EEquippableCategory::Rifle",
                defaultSkinUuid = "724a7f42-4315-eccf-0e76-77bdd3ec2e09",
                displayIcon = "https://media.valorant-api.com/weapons/ae3de142-4d85-2547-dd26-4e90bed35cf7/displayicon.png",
                displayName = "Bulldog",
                killStreamIcon = "https://media.valorant-api.com/weapons/ae3de142-4d85-2547-dd26-4e90bed35cf7/killstreamicon.png",
                shopDataDto = ShopDataDto(
                    cost = 2050,
                    category = "Rifles",
                    shopOrderPriority = 0,
                    categoryText = "Assault Rifles",
                    canBeTrashed = true,
                    image = null,
                    newImage = "https://media.valorant-api.com/weapons/ae3de142-4d85-2547-dd26-4e90bed35cf7/shop/newimage.png",
                    newImage2 = null,
                    assetPath = "ShooterGame/Content/Equippables/Guns/Rifles/Burst/BurstPurchase"
                ),
                uuid = "ae3de142-4d85-2547-dd26-4e90bed35cf7",
                weaponStatsDto = WeaponStatsDto(
                    fireRate = "10.0",
                    magazineSize = 24,
                    wallPenetration = "EWallPenetrationDisplayType::Medium",
                    feature = null,
                    altFireType = "EWeaponAltFireDisplayType::ADS",
                    adsStats = AdsStatsDto(
                        zoomMultiplier = 1.25,
                        fireRate = 6.315715,
                        runSpeedMultiplier = 0.76,
                        burstCount = 3,
                        firstBulletAccuracy = 0.3
                    )
                )
            ),
            WeaponDto(
                assetPath = "ShooterGame/Content/Equippables/Guns/Rifles/Carbine/CarbinePrimaryAsset",
                category = "EEquippableCategory::Rifle",
                defaultSkinUuid = "337cb216-4a6e-d85d-88c2-f29ab317784c",
                displayIcon = "https://media.valorant-api.com/weapons/ee8e8d15-496b-07ac-e5f6-8fae5d4c7b1a/displayicon.png",
                displayName = "Phantom",
                killStreamIcon = "https://media.valorant-api.com/weapons/ee8e8d15-496b-07ac-e5f6-8fae5d4c7b1a/killstreamicon.png",
                shopDataDto = ShopDataDto(
                    cost = 2900,
                    category = "Rifles",
                    shopOrderPriority = 0,
                    categoryText = "Assault Rifles",
                    canBeTrashed = true,
                    image = null,
                    newImage = "https://media.valorant-api.com/weapons/ee8e8d15-496b-07ac-e5f6-8fae5d4c7b1a/shop/newimage.png",
                    newImage2 = null,
                    assetPath = "ShooterGame/Content/Equippables/Guns/Rifles/Carbine/ACRWeaponPurchase"
                ),
                uuid = "ee8e8d15-496b-07ac-e5f6-8fae5d4c7b1a",
                weaponStatsDto = WeaponStatsDto(
                    fireRate = "11.0",
                    magazineSize = 30,
                    wallPenetration = "EWallPenetrationDisplayType::Medium",
                    feature = "EWeaponStatsFeature::Silenced",
                    altFireType = "EWeaponAltFireDisplayType::ADS",
                    adsStats = AdsStatsDto(
                        zoomMultiplier = 1.25,
                        fireRate = 9.9,
                        runSpeedMultiplier = 0.76,
                        burstCount = 1,
                        firstBulletAccuracy = 0.11000001
                    )
                )
            )
        )
    }
}