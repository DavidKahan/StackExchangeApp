package com.davidkahan.stackexchange.ui.main

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.davidkahan.stackexchange.data.repository.StackExchangeRepository
import com.davidkahan.stackexchange.datamodels.Question
import kotlinx.coroutines.flow.Flow

class MainViewModel @ViewModelInject() constructor(private val repository: StackExchangeRepository): ViewModel() {

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