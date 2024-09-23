package com.tejas.multiplatform.dailypulse.articles.presentation

import com.tejas.multiplatform.dailypulse.articles.application.Article

data class ArticlesState(
    val articles: List<Article> = listOf(),
    val loading: Boolean = false,
    val error: String? = null
)

