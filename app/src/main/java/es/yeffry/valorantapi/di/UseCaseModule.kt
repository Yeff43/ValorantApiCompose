package es.yeffry.valorantapi.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import es.yeffry.valorantapi.domain.repository.AgentsRepositoryInterface
import es.yeffry.valorantapi.domain.repository.CurrenciesRepositoryInterface
import es.yeffry.valorantapi.domain.repository.MapsRepositoryInterface
import es.yeffry.valorantapi.domain.repository.WeaponsRepositoryInterface
import es.yeffry.valorantapi.domain.usecase.agents.AgentsUseCaseImpl
import es.yeffry.valorantapi.domain.usecase.agents.AgentsUseCaseInterface
import es.yeffry.valorantapi.domain.usecase.currencies.CurrenciesUseCaseImpl
import es.yeffry.valorantapi.domain.usecase.currencies.CurrenciesUseCaseInterface
import es.yeffry.valorantapi.domain.usecase.maps.MapsUseCaseImpl
import es.yeffry.valorantapi.domain.usecase.maps.MapsUseCaseInterface
import es.yeffry.valorantapi.domain.usecase.weapons.WeaponsUseCaseImpl
import es.yeffry.valorantapi.domain.usecase.weapons.WeaponsUseCaseInterface

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Provides
    fun provideAgentsUseCase(agentsRepositoryInterface: AgentsRepositoryInterface): AgentsUseCaseInterface =
        AgentsUseCaseImpl(agentsRepositoryInterface)

    @Provides
    fun provideWeaponsUseCase(weaponsRepositoryInterface: WeaponsRepositoryInterface): WeaponsUseCaseInterface =
        WeaponsUseCaseImpl(weaponsRepositoryInterface)

    @Provides
    fun provideCurrenciesUseCase(currenciesRepositoryInterface: CurrenciesRepositoryInterface): CurrenciesUseCaseInterface =
        CurrenciesUseCaseImpl(currenciesRepositoryInterface)

    @Provides
    fun provideMapsUseCase(mapsRepositoryInterface: MapsRepositoryInterface): MapsUseCaseInterface =
        MapsUseCaseImpl(mapsRepositoryInterface)
}