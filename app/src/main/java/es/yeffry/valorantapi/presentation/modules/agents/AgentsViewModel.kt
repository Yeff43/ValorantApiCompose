package es.yeffry.valorantapi.presentation.modules.agents

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import es.yeffry.valorantapi.domain.entities.Agent
import es.yeffry.valorantapi.domain.usecase.agents.AgentsUseCaseInterface
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

data class AgentScreenState(
    val agents: List<Agent>? = listOf(),
    val message: String = ""
)

@HiltViewModel
class AgentsViewModel @Inject constructor(private val useCase: AgentsUseCaseInterface): ViewModel() {
    private val scope = CoroutineScope(Dispatchers.IO)
    private val _uiState = MutableStateFlow(AgentScreenState())
    val uiState = _uiState.asStateFlow()

    init{
        scope.launch {
           loadData()
        }
    }

    private suspend fun loadData() {
       scope.launch {
           val res = useCase.getAgents()
           _uiState.update { it.copy(agents = res) }
       }
    }

    fun getFilteredList(query: String, list: List<Agent>?): List<Agent>? {
        if (query.isNotEmpty()) {
            return list?.filter { it.displayName.lowercase().contains(query.lowercase()) }
        }
        return list
    }
}