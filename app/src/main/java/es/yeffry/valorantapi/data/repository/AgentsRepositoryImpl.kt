package es.yeffry.valorantapi.data.repository

import es.yeffry.valorantapi.data.datasource.agents.AgentsDataSourceInterface
import es.yeffry.valorantapi.data.datasource.agents.remote.api.dto.AbilityDto
import es.yeffry.valorantapi.data.datasource.agents.dto.AgentDto
import es.yeffry.valorantapi.data.datasource.agents.dto.RoleDto
import es.yeffry.valorantapi.di.Mock
import es.yeffry.valorantapi.domain.entities.Ability
import es.yeffry.valorantapi.domain.entities.Agent
import es.yeffry.valorantapi.domain.entities.Role
import es.yeffry.valorantapi.domain.repository.AgentsRepositoryInterface
import es.yeffry.valorantapi.domain.repository.MapperInterface

class AgentsRepositoryImpl(
    private val dataSource: AgentsDataSourceInterface,
    @Mock private val mockDataSource: AgentsDataSourceInterface
) : AgentsRepositoryInterface {

    private val mapperAbilities = object : MapperInterface<AbilityDto, Ability> {
        override fun AbilityDto.toDomain(): Ability {
            return Ability(description, displayIcon, displayName, slot)
        }
    }

    private val mapperRoles = object: MapperInterface<RoleDto, Role> {
        override fun RoleDto.toDomain(): Role {
            return Role(assetPath, description, displayIcon, displayName, uuid)
        }

    }

    private val mapperAgent = object : MapperInterface<AgentDto, Agent> {
        override fun AgentDto.toDomain(): Agent {
            return Agent(
                with(mapperAbilities) { abilities.map { it.toDomain() } },
                assetPath,
                background,
                backgroundGradientColors,
                bustPortrait,
                description,
                displayIcon,
                displayIconSmall,
                displayName,
                fullPortrait,
                fullPortraitV2,
                killfeedPortrait,
                with(mapperRoles) { role.toDomain() },
                uuid
            )
        }

    }

    override suspend fun getAgents(): List<Agent>? {
        with(mapperAgent) {
            val res = mockDataSource.getAgents()
            return res?.map { it.toDomain() }
        }
    }
}