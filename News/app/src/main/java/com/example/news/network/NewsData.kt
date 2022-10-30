package com.example.news.network

import com.squareup.moshi.Json

data class NewsData(
    val id: Int,
    val status: String?,
    val totalResult: Int?,
    val articles: List<Articles>?
)