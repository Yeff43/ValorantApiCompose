package es.yeffry.valorantapi.data.datasource.maps.dto

data class CalloutDto(
    val locationDto: LocationDto,
    val regionName: String,
    val superRegionName: String
)