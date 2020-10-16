package com.davidkahan.stackexchange.ui.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.davidkahan.stackexchange.data.database.StackExchangeDatabase
import com.davidkahan.stackexchange.data.network.StackExchangeApi
import com.davidkahan.stackexchange.data.repository.StackExchangeRepository
import com.davidkahan.stackexchange.datamodels.Question
import kotlinx.coroutines.flow.Flow

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: StackExchangeRepository

    init {
        val stackExchangeDatabase = StackExchangeDatabase.getDatabase(application,viewModelScope)
        val stackExchangeApi = StackExchangeApi.stackExchangeApiService
        repository = StackExchangeRepository(stackExchangeApi,stackExchangeDatabase)
    }


    fun fetchAllQuestions(): Flow<PagingData<Question>> {
        return repository.fetchQuestions().cachedIn(viewModelScope)
    }

    fun fetchFilteredQuestionsByIsAnswered(isAnswered: Boolean): Flow<PagingData<Question>>  {
        return repository.getFilteredQuestionsByIsAnswered(isAnswered).cachedIn(viewModelScope)
    }

    fun filteredQuestionsByIsAnswered(isAnswered: Boolean): LiveData<List<Question>> {
        return repository.getFilteredQuestionsLiveDataByIsAnswered(isAnswered)
    }

    fun refresh(){
        repository.refresh()
    }
}