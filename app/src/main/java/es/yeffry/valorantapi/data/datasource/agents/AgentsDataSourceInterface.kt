package es.yeffry.valorantapi.data.datasource.agents

import es.yeffry.valorantapi.data.datasource.agents.dto.AgentDto

interface AgentsDataSourceInterface {

    suspend fun getAgents(): List<AgentDto>?
}