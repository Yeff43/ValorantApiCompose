package es.yeffry.valorantapi.data.datasource.maps.mock

import es.yeffry.valorantapi.data.datasource.maps.MapsDataSourceInterface
import es.yeffry.valorantapi.data.datasource.maps.dto.CalloutDto
import es.yeffry.valorantapi.data.datasource.maps.dto.LocationDto
import es.yeffry.valorantapi.data.datasource.maps.dto.MapDto

class MapsMockDataSourceImpl() : MapsDataSourceInterface {
    override suspend fun getMaps(): List<MapDto>? {
        return listOf(
            MapDto(
                uuid = "7eaecc1b-4337-bbf6-6ab9-04b8f06b3319",
                displayName = "Ascent",
                narrativeDescription = "An open playground for small wars of position and attrition divide two sites on Ascent. Each site can be fortified by irreversible bomb doors; once they’re down, you’ll have to destroy them or find another way. Yield as little territory as possible.",
                tacticalDescription = "A/B Sites",
                coordinates = "45°26'BF'N,12°20'Q'E",
                displayIcon = "https://media.valorant-api.com/maps/7eaecc1b-4337-bbf6-6ab9-04b8f06b3319/displayicon.png",
                listViewIcon = "https://media.valorant-api.com/maps/7eaecc1b-4337-bbf6-6ab9-04b8f06b3319/listviewicon.png",
                listViewIconTall = "https://media.valorant-api.com/maps/7eaecc1b-4337-bbf6-6ab9-04b8f06b3319/listviewicontall.png",
                splash = "https://media.valorant-api.com/maps/7eaecc1b-4337-bbf6-6ab9-04b8f06b3319/splash.png",
                stylizedBackgroundImage = "https://media.valorant-api.com/maps/7eaecc1b-4337-bbf6-6ab9-04b8f06b3319/stylizedbackgroundimage.png",
                premierBackgroundImage = "https://media.valorant-api.com/maps/7eaecc1b-4337-bbf6-6ab9-04b8f06b3319/premierbackgroundimage.png",
                assetPath = "ShooterGame/Content/Maps/Ascent/Ascent_PrimaryAsset",
                mapUrl = "/Game/Maps/Ascent/Ascent",
                xMultiplier = 0.00007,
                yMultiplier = -0.00007,
                xScalarToAdd = 0.813895,
                yScalarToAdd = 0.573242,
                calloutDtos = listOf(
                    CalloutDto(
                        regionName = "Tree",
                        superRegionName = "A",
                        locationDto = LocationDto(3980.9062, -5938.758)
                    ),
                    CalloutDto(
                        regionName = "Lobby",
                        superRegionName = "A",
                        locationDto = LocationDto(4489.032, -3014.0515)
                    ),
                    CalloutDto(
                        regionName = "Main",
                        superRegionName = "A",
                        locationDto = LocationDto(5321.6206, -4710.1274)
                    ),
                    CalloutDto(
                        regionName = "Window",
                        superRegionName = "A",
                        locationDto = LocationDto(4023.0244, -8180.692)
                    ),
                    CalloutDto(
                        regionName = "Site",
                        superRegionName = "A",
                        locationDto = LocationDto(6153.585, -6626.2114)
                    )
                )
            )

        )
    }
}