package es.yeffry.valorantapi.presentation.modules.weapons

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import es.yeffry.valorantapi.domain.entities.Weapon
import es.yeffry.valorantapi.domain.usecase.weapons.WeaponsUseCaseInterface
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

data class WeaponsScreenState(
    val weapons: List<Weapon>? = listOf(),
    val message: String = ""
)

@HiltViewModel
class WeaponsViewModel @Inject constructor(private val useCase: WeaponsUseCaseInterface): ViewModel() {
    private val scope = CoroutineScope(Dispatchers.IO)
    private val _uiState = MutableStateFlow(WeaponsScreenState())
    val uiState = _uiState.asStateFlow()

    init{
        scope.launch {
            loadData()
        }
    }

    private suspend fun loadData() {
        scope.launch {
            val res = useCase.getWeapons()
            _uiState.update { it.copy(weapons = res) }
        }
    }

    fun getFilteredWeapons(query: String, list: List<Weapon>?): List<Weapon> {
        if (query.isNotEmpty()) {
            return list?.filter { it.name.lowercase().contains(query.lowercase()) }!!
        }
        return list!!
    }
}