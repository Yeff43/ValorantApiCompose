package es.yeffry.valorantapi.domain.usecase.agents

import es.yeffry.valorantapi.domain.entities.Agent
import es.yeffry.valorantapi.domain.repository.AgentsRepositoryInterface
import javax.inject.Inject

class AgentsUseCaseImpl @Inject constructor(private val repository: AgentsRepositoryInterface): AgentsUseCaseInterface {
    override suspend fun getAgents(): List<Agent>? {
        return repository.getAgents()
    }
}