package com.tejas.multiplatform.dailypulse.articles.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ArticleResourcesRaw(
    @SerialName("country")
    val country: String?,
    @SerialName("description")
    val description: String,
    @SerialName("language")
    val language: String?,
    @SerialName("name")
    val name: String,
)
