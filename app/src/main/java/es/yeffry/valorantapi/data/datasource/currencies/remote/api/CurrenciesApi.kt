package es.yeffry.valorantapi.data.datasource.currencies.remote.api

import es.yeffry.valorantapi.data.datasource.currencies.dto.CurrencyDto
import retrofit2.Response
import retrofit2.http.GET

interface CurrenciesApi {

    @GET("/v1/currencies")
    suspend fun getCurrencies(): Response<List<CurrencyDto>?>
}