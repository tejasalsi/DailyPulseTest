package com.tejas.multiplatform.dailypulse.articles.di

import com.tejas.multiplatform.dailypulse.articles.presentation.ArticleSourceViewModel
import com.tejas.multiplatform.dailypulse.articles.data.ArticlesService
import com.tejas.multiplatform.dailypulse.articles.application.ArticlesUseCase
import com.tejas.multiplatform.dailypulse.articles.presentation.ArticlesViewModel
import org.koin.dsl.module

val articleModule = module {
    single<ArticlesService> {
        ArticlesService(get())
    }
    single<ArticlesUseCase> {
        ArticlesUseCase(get())
    }
    single<ArticlesViewModel> {
        ArticlesViewModel(get())
    }
}