package es.yeffry.valorantapi.presentation.modules.maps

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import es.yeffry.valorantapi.domain.entities.Category
import es.yeffry.valorantapi.domain.entities.Map
import es.yeffry.valorantapi.domain.usecase.maps.MapsUseCaseInterface
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

data class MapsScreenState(
    val maps: List<Map> = listOf(),
    val message: String = ""
)

@HiltViewModel
class MapsViewModel @Inject constructor(private val useCase: MapsUseCaseInterface): ViewModel() {
    private val scope = CoroutineScope(Dispatchers.IO)
    private val _uiState = MutableStateFlow(MapsScreenState())
    val uiState = _uiState.asStateFlow()

    init{
        scope.launch {
            loadData()
        }
    }

    private fun loadData() {
        scope.launch {
            val res = useCase.getMaps()
            _uiState.update { it.copy(maps = res!!) }
        }
    }

    fun getFilteredMaps(query: String, list: List<Map>): List<Map> {
        if (query.isNotEmpty()) {
            return list.filter { it.displayName.lowercase().contains(query.lowercase()) }
        }
        return list
    }
}