package com.tejas.multiplatform.dailypulse.di

import com.tejas.multiplatform.dailypulse.articles.di.articleModule
import com.tejas.multiplatform.dailypulse.articles.di.articleResourceModule

val sharedKoinModules = listOf(
    articleModule, articleResourceModule, networkModule
)