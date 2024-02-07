package es.yeffry.valorantapi.data.datasource.agents.dto

import es.yeffry.valorantapi.data.datasource.agents.remote.api.dto.AbilityDto

data class AgentDto(
    val abilities: List<AbilityDto>,
    val assetPath: String,
    val background: String,
    val backgroundGradientColors: List<String>,
    val bustPortrait: String,
    val description: String,
    val developerName: String,
    val displayIcon: String,
    val displayIconSmall: String,
    val displayName: String,
    val fullPortrait: String,
    val fullPortraitV2: String,
    val isAvailableForTest: Boolean,
    val isBaseContent: Boolean,
    val isFullPortraitRightFacing: Boolean,
    val isPlayableCharacter: Boolean,
    val killfeedPortrait: String,
    val role: RoleDto,
    val uuid: String,
)