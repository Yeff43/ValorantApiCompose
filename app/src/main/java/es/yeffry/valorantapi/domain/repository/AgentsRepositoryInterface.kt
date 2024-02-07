package es.yeffry.valorantapi.domain.repository

import es.yeffry.valorantapi.domain.entities.Agent

interface AgentsRepositoryInterface {

    suspend fun getAgents(): List<Agent>?
}