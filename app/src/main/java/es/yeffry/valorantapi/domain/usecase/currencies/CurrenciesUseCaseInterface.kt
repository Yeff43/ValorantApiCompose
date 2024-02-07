package es.yeffry.valorantapi.domain.usecase.currencies

import es.yeffry.valorantapi.domain.entities.Currency

interface CurrenciesUseCaseInterface {
    suspend fun getCurrencies(): List<Currency>?
}