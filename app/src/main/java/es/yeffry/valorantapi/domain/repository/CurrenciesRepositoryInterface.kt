package es.yeffry.valorantapi.domain.repository

import es.yeffry.valorantapi.domain.entities.Currency

interface CurrenciesRepositoryInterface {

    suspend fun getCurrencies(): List<Currency>?
}