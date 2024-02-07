package es.yeffry.valorantapi.data.datasource.currencies.mock

import es.yeffry.valorantapi.data.datasource.currencies.CurrenciesDataSourceInterface
import es.yeffry.valorantapi.data.datasource.currencies.dto.CurrencyDto

class CurrenciesMockDataSourceImpl : CurrenciesDataSourceInterface {
    override suspend fun getCurrencies(): List<CurrencyDto>? {
        return listOf(
            CurrencyDto(
                assetPath = "ShooterGame/Content/Currencies/Currency_AresPoints_DataAsset",
                displayIcon = "https://media.valorant-api.com/currencies/85ad13f7-3d1b-5128-9eb2-7cd8ee0b5741/displayicon.png",
                displayName = "VP",
                displayNameSingular = "VP",
                largeIcon = "https://media.valorant-api.com/currencies/85ad13f7-3d1b-5128-9eb2-7cd8ee0b5741/largeicon.png",
                uuid = "85ad13f7-3d1b-5128-9eb2-7cd8ee0b5741"
            ),
            CurrencyDto(
                assetPath = "ShooterGame/Content/Currencies/Currency_Dough_DataAsset",
                displayIcon = "https://media.valorant-api.com/currencies/85ca954a-41f2-ce94-9b45-8ca3dd39a00d/displayicon.png",
                displayName = "Kingdom Credits",
                displayNameSingular = "Kingdom Credit",
                largeIcon = "https://media.valorant-api.com/currencies/85ca954a-41f2-ce94-9b45-8ca3dd39a00d/largeicon.png",
                uuid = "85ca954a-41f2-ce94-9b45-8ca3dd39a00d"
            ),
            CurrencyDto(
                assetPath = "ShooterGame/Content/Currencies/Currency_RecruitmentToken_DataAsset",
                displayIcon = "https://media.valorant-api.com/currencies/f08d4ae3-939c-4576-ab26-09ce1f23bb37/displayicon.png",
                displayName = "Free Agents",
                displayNameSingular = "Free Agent",
                largeIcon = "https://media.valorant-api.com/currencies/f08d4ae3-939c-4576-ab26-09ce1f23bb37/largeicon.png",
                uuid = "f08d4ae3-939c-4576-ab26-09ce1f23bb37"
            ),
            CurrencyDto(
                assetPath = "ShooterGame/Content/Currencies/Currency_UpgradeToken_DataAsset",
                displayIcon = "https://media.valorant-api.com/currencies/e59aa87c-4cbf-517a-5983-6e81511be9b7/displayicon.png",
                displayName = "Radianite Points",
                displayNameSingular = "Radianite Point",
                largeIcon = "https://media.valorant-api.com/currencies/e59aa87c-4cbf-517a-5983-6e81511be9b7/largeicon.png",
                uuid = "e59aa87c-4cbf-517a-5983-6e81511be9b7"
            )
        )
    }
}