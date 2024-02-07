package es.yeffry.valorantapi.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import es.yeffry.valorantapi.data.datasource.agents.AgentsDataSourceInterface
import es.yeffry.valorantapi.data.datasource.agents.mock.AgentsMockDataSourceImpl
import es.yeffry.valorantapi.data.datasource.agents.remote.AgentsDataSourceImpl
import es.yeffry.valorantapi.data.datasource.agents.remote.api.AgentsApi
import es.yeffry.valorantapi.data.datasource.currencies.CurrenciesDataSourceInterface
import es.yeffry.valorantapi.data.datasource.currencies.mock.CurrenciesMockDataSourceImpl
import es.yeffry.valorantapi.data.datasource.currencies.remote.CurrenciesDataSourceImpl
import es.yeffry.valorantapi.data.datasource.currencies.remote.api.CurrenciesApi
import es.yeffry.valorantapi.data.datasource.maps.MapsDataSourceInterface
import es.yeffry.valorantapi.data.datasource.maps.mock.MapsMockDataSourceImpl
import es.yeffry.valorantapi.data.datasource.maps.remote.MapsDataSourceImpl
import es.yeffry.valorantapi.data.datasource.maps.remote.api.MapsApi
import es.yeffry.valorantapi.data.datasource.weapons.WeaponsDataSourceInterface
import es.yeffry.valorantapi.data.datasource.weapons.mock.WeaponsMockDataSourceImpl
import es.yeffry.valorantapi.data.datasource.weapons.remote.WeaponsDataSourceImpl
import es.yeffry.valorantapi.data.datasource.weapons.remote.api.WeaponsApi
import es.yeffry.valorantapi.manager.network.NetworkManager
import javax.inject.Qualifier

@Qualifier
annotation class Mock

@Module
@InstallIn(SingletonComponent::class)
class DataSourceModule {

    @Provides
    fun provideAgentsRemoteDataSource(
        api: AgentsApi,
        networkManager: NetworkManager
    ): AgentsDataSourceInterface =
        AgentsDataSourceImpl(api, networkManager)

    @Provides
    @Mock
    fun provideAgentsMockDataSource(): AgentsDataSourceInterface =
        AgentsMockDataSourceImpl()

    @Provides
    fun provideWeaponsRemoteDataSource(
        api: WeaponsApi,
        networkManager: NetworkManager
    ): WeaponsDataSourceInterface =
        WeaponsDataSourceImpl(api, networkManager)

    @Provides
    @Mock
    fun provideWeaponsMockDataSource(): WeaponsDataSourceInterface =
        WeaponsMockDataSourceImpl()

    @Provides
    fun provideCurrenciesDataSource(
        api: CurrenciesApi,
        networkManager: NetworkManager
    ): CurrenciesDataSourceInterface =
        CurrenciesDataSourceImpl(api, networkManager)

    @Provides
    @Mock
    fun provideCurrenciesMockDataSource(): CurrenciesDataSourceInterface =
        CurrenciesMockDataSourceImpl()

    @Provides
    fun provideMapsDataSource(
        api: MapsApi,
        networkManager: NetworkManager
    ): MapsDataSourceInterface =
        MapsDataSourceImpl(api, networkManager)

    @Provides
    @Mock
    fun provideMapsMockDataSource(): MapsDataSourceInterface =
        MapsMockDataSourceImpl()
}