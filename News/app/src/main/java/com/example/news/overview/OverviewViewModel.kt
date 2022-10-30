package com.example.news.overview

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.news.network.NewsData
import androidx.lifecycle.viewModelScope
import com.example.news.network.NewsApi
import kotlinx.coroutines.launch

enum class NewsApiStatus { LOADING, ERROR, DONE }

class OverviewViewModel : ViewModel() {

    private val _status = MutableLiveData<NewsApiStatus>()
    val status: LiveData<NewsApiStatus> = _status

    private val _newsData = MutableLiveData<NewsData>()
    val newsData: LiveData<NewsData> = _newsData
}