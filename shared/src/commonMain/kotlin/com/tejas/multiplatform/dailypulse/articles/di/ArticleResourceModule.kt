package com.tejas.multiplatform.dailypulse.articles.di

import com.tejas.multiplatform.dailypulse.articles.application.ArticleResourceUseCase
import com.tejas.multiplatform.dailypulse.articles.application.ArticlesUseCase
import com.tejas.multiplatform.dailypulse.articles.data.ArticleSourceService
import com.tejas.multiplatform.dailypulse.articles.presentation.ArticleSourceViewModel
import org.koin.dsl.module

val articleResourceModule = module {
    single<ArticleSourceService> {
        ArticleSourceService(get())
    }
    single<ArticleResourceUseCase> {
        ArticleResourceUseCase(get())
    }
    single<ArticleSourceViewModel> {
        ArticleSourceViewModel(get())
    }
}