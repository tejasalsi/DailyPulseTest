package com.tejas.multiplatform.dailypulse.di

import com.tejas.multiplatform.dailypulse.articles.presentation.ArticleSourceViewModel
import com.tejas.multiplatform.dailypulse.articles.presentation.ArticlesViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.context.startKoin

fun initKoin() {
    val modules = sharedKoinModules

    startKoin {
        modules(modules)
    }

    class ArticlesInjector: KoinComponent {
        val articlesViewModel: ArticlesViewModel by inject()
        val articleSourceViewModel: ArticleSourceViewModel by inject()
    }
}