package es.yeffry.valorantapi.data.repository

import es.yeffry.valorantapi.data.datasource.currencies.CurrenciesDataSourceInterface
import es.yeffry.valorantapi.data.datasource.currencies.dto.CurrencyDto
import es.yeffry.valorantapi.di.Mock
import es.yeffry.valorantapi.domain.entities.Currency
import es.yeffry.valorantapi.domain.repository.CurrenciesRepositoryInterface
import es.yeffry.valorantapi.domain.repository.MapperInterface

class CurrenciesRepositoryImpl(
    private val dataSource: CurrenciesDataSourceInterface,
    @Mock private val mockDataSource: CurrenciesDataSourceInterface
) : CurrenciesRepositoryInterface {

    private val mapperCurrencies = object : MapperInterface<CurrencyDto, Currency> {
        override fun CurrencyDto.toDomain(): Currency {
            return Currency(
                displayName, displayNameSingular, displayIcon
            )
        }
    }

    override suspend fun getCurrencies(): List<Currency>? {
        val res = mockDataSource.getCurrencies()
        with(mapperCurrencies) {
            return res?.map { it.toDomain() }
        }
    }
}