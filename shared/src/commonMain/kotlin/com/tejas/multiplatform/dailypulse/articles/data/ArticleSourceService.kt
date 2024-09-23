package com.tejas.multiplatform.dailypulse.articles.data

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class ArticleSourceService(
    private val httpClient: HttpClient) {

    private val apiKey = "e999b58deb74491b9f2cf13555a210b1"
    suspend fun fetchArticleSources(): List<ArticleResourcesRaw> {
        val response: ArticleResourcesResponse = httpClient.get(
            "https://newsapi.org/v2/sources?&apiKey=$apiKey"
        ).body()
        return response.sources
    }
}