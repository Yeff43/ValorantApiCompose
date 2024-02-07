package es.yeffry.valorantapi.manager.network.dto

import com.google.gson.annotations.SerializedName

class ErrorBodyDTO (
    @SerializedName("error")
    val errorMessage: String
)