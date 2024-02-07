package es.yeffry.valorantapi.presentation.modules.home

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import es.yeffry.valorantapi.R
import es.yeffry.valorantapi.domain.entities.Agent
import es.yeffry.valorantapi.domain.entities.Category
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

data class HomeScreenState(
    val categories: List<Category> = listOf(),
    val message: String = ""
)

@HiltViewModel
class HomeViewModel @Inject constructor(): ViewModel() {
    private val scope = CoroutineScope(Dispatchers.IO)
    private val _uiState = MutableStateFlow(HomeScreenState())
    val uiState = _uiState.asStateFlow()
    private val categories = listOf(
        Category("agents", R.drawable.brimstone_avatar),
        Category("weapons", R.drawable.weapons_avatar),
        Category("maps", R.drawable.maps_avatar),
        Category("currencies", R.drawable.valorant_currencies)
    )

    init{
        scope.launch {
            loadData()
        }
    }

    private fun loadData() {
        scope.launch {
            _uiState.update { it.copy(categories = categories) }
        }
    }

    fun getFilteredCategories(query: String, list: List<Category>): List<Category> {
        if (query.isNotEmpty()) {
            return list.filter { it.title.lowercase().contains(query.lowercase()) }
        }
        return list
    }
}