package com.tejas.multiplatform.dailypulse.articles.presentation

import com.tejas.multiplatform.dailypulse.articles.application.ArticleSource


data class ArticleResourceState(
    val articles: List<ArticleSource> = listOf(),
    val loading: Boolean = false,
    val error: String? = null
)
