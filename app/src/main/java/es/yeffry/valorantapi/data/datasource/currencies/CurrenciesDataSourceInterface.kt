package es.yeffry.valorantapi.data.datasource.currencies

import es.yeffry.valorantapi.data.datasource.currencies.dto.CurrencyDto

interface CurrenciesDataSourceInterface {
    suspend fun getCurrencies(): List<CurrencyDto>?
}