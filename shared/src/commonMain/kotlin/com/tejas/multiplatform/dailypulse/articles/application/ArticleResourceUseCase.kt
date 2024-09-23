package com.tejas.multiplatform.dailypulse.articles.application
import com.tejas.multiplatform.dailypulse.articles.data.ArticleResourcesRaw
import com.tejas.multiplatform.dailypulse.articles.data.ArticleSourceService

class ArticleResourceUseCase(
    private val articleResourceService: ArticleSourceService
) {

    suspend fun getArticleResources(): List<ArticleSource> {
        val articleResourcesRaw = articleResourceService.fetchArticleSources()
        return mapArticleResources(articleResourcesRaw)
    }

    private fun mapArticleResources(articleResourcesRaw: List<ArticleResourcesRaw>):
            List<ArticleSource> = articleResourcesRaw.map { articleResourceRaw ->
                ArticleSource(resourceTitle = articleResourceRaw.name,
                    resourceDesc = articleResourceRaw.description,
                    resourceCountry = articleResourceRaw.country ?: "no",
                    resourceLanguage = articleResourceRaw.language ?: "no")
    }
}