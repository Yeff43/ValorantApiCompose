package es.yeffry.valorantapi.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import es.yeffry.valorantapi.data.datasource.Config
import es.yeffry.valorantapi.data.datasource.agents.remote.api.AgentsApi
import es.yeffry.valorantapi.data.datasource.currencies.remote.api.CurrenciesApi
import es.yeffry.valorantapi.data.datasource.maps.remote.api.MapsApi
import es.yeffry.valorantapi.data.datasource.weapons.remote.api.WeaponsApi
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ApiModule {
    @Provides
    @Singleton
    fun provideHttpLoggingInterceptor(): HttpLoggingInterceptor =
        HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

    @Provides
    @Singleton
    fun provideHttpClient(
        httpLoggingInterceptor: HttpLoggingInterceptor,
    ): OkHttpClient =
        OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor)
            .build()

    @Provides
    @Singleton
    fun provideRetrofitClient(httpClient: OkHttpClient): Retrofit =
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(Config.BASE_URL)
            .client(httpClient)
            .build()

    @Provides
    @Singleton
    fun provideAgentsApi(retrofit: Retrofit): AgentsApi =
        retrofit.create(AgentsApi::class.java)

    @Provides
    @Singleton
    fun provideWeaponsApi(retrofit: Retrofit): WeaponsApi =
        retrofit.create(WeaponsApi::class.java)

    @Provides
    @Singleton
    fun provideCurrenciesApi(retrofit: Retrofit): CurrenciesApi =
        retrofit.create(CurrenciesApi::class.java)

    @Provides
    @Singleton
    fun provideMapsApi(retrofit: Retrofit): MapsApi =
        retrofit.create(MapsApi::class.java)
}