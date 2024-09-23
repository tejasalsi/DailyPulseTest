package com.tejas.multiplatform.dailypulse.android.di

import com.tejas.multiplatform.dailypulse.articles.presentation.ArticleSourceViewModel
import com.tejas.multiplatform.dailypulse.articles.presentation.ArticlesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val ViewModelsModule = module {
    viewModel {
        ArticlesViewModel(get())
        ArticleSourceViewModel(get())
    }
}