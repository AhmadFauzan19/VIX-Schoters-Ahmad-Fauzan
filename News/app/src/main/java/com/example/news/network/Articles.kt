package com.example.news.network

import com.squareup.moshi.Json

data class Articles(
    val sources: List<Sources>?,
    val author: String?,
    val title: String?,
    val description: String?,
    val url: String?,
    val urlToImg: String?,
    val publishedAt: String?,
    val content: String?
)