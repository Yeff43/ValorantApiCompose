package es.yeffry.valorantapi.domain.usecase.currencies

import es.yeffry.valorantapi.domain.entities.Currency
import es.yeffry.valorantapi.domain.repository.CurrenciesRepositoryInterface
import javax.inject.Inject

class CurrenciesUseCaseImpl @Inject constructor(private val repository: CurrenciesRepositoryInterface) :
    CurrenciesUseCaseInterface {
    override suspend fun getCurrencies(): List<Currency>? {
        return repository.getCurrencies()
    }
}