package es.yeffry.valorantapi.data.datasource.currencies.remote

import es.yeffry.valorantapi.data.datasource.currencies.CurrenciesDataSourceInterface
import es.yeffry.valorantapi.data.datasource.currencies.dto.CurrencyDto
import es.yeffry.valorantapi.data.datasource.currencies.remote.api.CurrenciesApi
import es.yeffry.valorantapi.manager.network.NetworkManager

class CurrenciesDataSourceImpl(
    private val api: CurrenciesApi,
    private val networkManager: NetworkManager
) : CurrenciesDataSourceInterface {
    override suspend fun getCurrencies(): List<CurrencyDto>? {
        val res = networkManager.load { api.getCurrencies() }
        return res.getOrThrow()
    }
}