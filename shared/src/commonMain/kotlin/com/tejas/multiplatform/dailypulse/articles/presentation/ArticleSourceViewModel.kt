package com.tejas.multiplatform.dailypulse.articles.presentation

import com.tejas.multiplatform.dailypulse.BaseViewModel
import com.tejas.multiplatform.dailypulse.articles.application.ArticleResourceUseCase
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ArticleSourceViewModel(
    private val articleSourceUseCase: ArticleResourceUseCase
): BaseViewModel() {


    init {
        getArticleResources()
    }
    private val _articleResourceState: MutableStateFlow<ArticleResourceState> = MutableStateFlow(
        ArticleResourceState()
    )
    val articleResourceState: StateFlow<ArticleResourceState> get() = _articleResourceState

    private fun getArticleResources() {
        scope.launch {
            delay(1000)
            _articleResourceState.emit(ArticleResourceState(articleSourceUseCase.getArticleResources()))
        }
    }
}