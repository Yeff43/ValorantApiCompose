package es.yeffry.valorantapi.domain.usecase.agents

import es.yeffry.valorantapi.domain.entities.Agent

interface AgentsUseCaseInterface {

    suspend fun getAgents(): List<Agent>?

}