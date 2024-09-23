package com.tejas.multiplatform.dailypulse.android.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tejas.multiplatform.dailypulse.articles.application.ArticleSource
import com.tejas.multiplatform.dailypulse.articles.presentation.ArticleSourceViewModel
import org.koin.androidx.compose.getViewModel

@Composable
fun ArticleResourceScreen(onUpButtonClick: () -> Unit,
                          articleSourceViewModel: ArticleSourceViewModel = getViewModel()) {

    val articleSourceState = articleSourceViewModel.articleResourceState.collectAsState()

Column {
    if (articleSourceState.value.articles.isNotEmpty()) {
        ArticleSourceListView(articleSource = articleSourceState.value.articles)
    }
}


    
}

@Composable
private fun ArticleSourceListView(articleSource: List<ArticleSource>) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(articleSource) { articleSource ->
            ArticleSourceItemView(articleSource = articleSource)
        }
    }
}

@Composable
private fun ArticleSourceItemView(articleSource: ArticleSource) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)) {
        Text(text = articleSource.resourceTitle, style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 22.sp))
        Text(text = articleSource.resourceDesc)
        Text(text = "${articleSource.resourceCountry} - ${articleSource.resourceLanguage}", modifier = Modifier.align(Alignment.End))
    }
}