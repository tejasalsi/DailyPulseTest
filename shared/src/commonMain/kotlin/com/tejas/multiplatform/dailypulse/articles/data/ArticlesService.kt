package com.tejas.multiplatform.dailypulse.articles.data

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

open class ArticlesService(
    private val httpClient: HttpClient
) {
    private val country = "us"
    private val category = "business"
    private val apiKey = "e999b58deb74491b9f2cf13555a210b1"

    suspend fun fetchArticles(): List<ArticlesRaw> {
        val response: ArticlesResponse = httpClient.get(
            "https://newsapi.org/v2/top-headlines?country=$country&category=$category&apiKey=$apiKey"
        ).body()
        return response.articles
    }
}