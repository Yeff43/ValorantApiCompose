package es.yeffry.valorantapi.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import es.yeffry.valorantapi.data.datasource.agents.AgentsDataSourceInterface
import es.yeffry.valorantapi.data.datasource.currencies.CurrenciesDataSourceInterface
import es.yeffry.valorantapi.data.datasource.maps.MapsDataSourceInterface
import es.yeffry.valorantapi.data.datasource.weapons.WeaponsDataSourceInterface
import es.yeffry.valorantapi.data.repository.AgentsRepositoryImpl
import es.yeffry.valorantapi.data.repository.CurrenciesRepositoryImpl
import es.yeffry.valorantapi.data.repository.MapsRepositoryImpl
import es.yeffry.valorantapi.data.repository.WeaponsRepositoryImpl
import es.yeffry.valorantapi.domain.repository.AgentsRepositoryInterface
import es.yeffry.valorantapi.domain.repository.CurrenciesRepositoryInterface
import es.yeffry.valorantapi.domain.repository.MapsRepositoryInterface
import es.yeffry.valorantapi.domain.repository.WeaponsRepositoryInterface

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    fun provideAgentsRepository(agentDataSource: AgentsDataSourceInterface, @Mock agentMockDataSource: AgentsDataSourceInterface): AgentsRepositoryInterface =
        AgentsRepositoryImpl(agentDataSource, agentMockDataSource)

    @Provides
    fun provideWeaponsRepository(weaponsDatasource: WeaponsDataSourceInterface, @Mock weaponsMockDataSource: WeaponsDataSourceInterface): WeaponsRepositoryInterface =
        WeaponsRepositoryImpl(weaponsDatasource,weaponsMockDataSource)

    @Provides
    fun provideCurrenciesRepository(currenciesDataSource: CurrenciesDataSourceInterface, @Mock currenciesMockDataSource: CurrenciesDataSourceInterface): CurrenciesRepositoryInterface =
        CurrenciesRepositoryImpl(currenciesDataSource, currenciesMockDataSource)

    @Provides
    fun provideMapsRepository(mapsDataSource: MapsDataSourceInterface, @Mock mapsMockDataSource: MapsDataSourceInterface): MapsRepositoryInterface =
        MapsRepositoryImpl(mapsDataSource, mapsMockDataSource)
}