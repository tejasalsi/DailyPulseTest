package com.tejas.multiplatform.dailypulse.articles.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ArticlesRaw(
    @SerialName("title")
    val title: String,
    @SerialName("description")
    val description: String?,
    @SerialName("publishedAt")
    val date: String,
    @SerialName("urlToImage")
    val imageUrl: String?,
    @SerialName("source")
    val source: Source
) {
    @Serializable
    data class Source(
        @SerialName("id")
        val id: String?,
        @SerialName("name")
        val name: String
    )
}
