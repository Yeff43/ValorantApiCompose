package es.yeffry.valorantapi.presentation.modules.currencies

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import es.yeffry.valorantapi.domain.entities.Currency
import es.yeffry.valorantapi.domain.entities.Weapon
import es.yeffry.valorantapi.domain.usecase.currencies.CurrenciesUseCaseInterface
import es.yeffry.valorantapi.presentation.modules.weapons.WeaponsScreenState
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

data class CurrenciesScreenState(
    val currencies: List<Currency>? = listOf(),
    val message: String = ""
)

@HiltViewModel
class CurrenciesViewModel @Inject constructor(private val useCase: CurrenciesUseCaseInterface) :
    ViewModel() {

    private val scope = CoroutineScope(Dispatchers.IO)
    private val _uiState = MutableStateFlow(CurrenciesScreenState())
    val uiState = _uiState.asStateFlow()

    init{
        scope.launch {
            loadData()
        }
    }

    private suspend fun loadData() {
        scope.launch {
            val res = useCase.getCurrencies()
            _uiState.update { it.copy(currencies = res) }
        }
    }

    fun getFilteredCurrencies(query: String, list: List<Currency>?): List<Currency> {
        if (query.isNotEmpty()) {
            return list?.filter { it.displayName.lowercase().contains(query.lowercase()) }!!
        }
        return list!!
    }
}