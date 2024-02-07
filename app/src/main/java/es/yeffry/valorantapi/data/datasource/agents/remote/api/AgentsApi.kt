package es.yeffry.valorantapi.data.datasource.agents.remote.api

import es.yeffry.valorantapi.data.datasource.agents.dto.AgentDto
import retrofit2.Response
import retrofit2.http.GET

interface AgentsApi {

    @GET("/v1/agents?isPlayableCharacter=true?language=es")
    suspend fun getAgents(): Response<List<AgentDto>>
}