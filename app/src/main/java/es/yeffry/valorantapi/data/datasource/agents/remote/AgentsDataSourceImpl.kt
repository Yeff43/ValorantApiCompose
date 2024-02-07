package es.yeffry.valorantapi.data.datasource.agents.remote

import es.yeffry.valorantapi.data.datasource.agents.AgentsDataSourceInterface
import es.yeffry.valorantapi.data.datasource.agents.remote.api.AgentsApi
import es.yeffry.valorantapi.data.datasource.agents.dto.AgentDto
import es.yeffry.valorantapi.manager.network.NetworkManager

class AgentsDataSourceImpl(private val api: AgentsApi, private val networkManager: NetworkManager) : AgentsDataSourceInterface {
    override suspend fun getAgents(): List<AgentDto>? {
        val res = networkManager.load { api.getAgents() }
        return res.getOrThrow()
    }
}