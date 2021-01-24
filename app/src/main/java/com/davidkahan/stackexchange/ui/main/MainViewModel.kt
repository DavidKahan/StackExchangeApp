package com.davidkahan.stackexchange.ui.main

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.davidkahan.stackexchange.data.repository.StackExchangeRepository
import com.davidkahan.stackexchange.datamodels.Question
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.flow.collectLatest

class MainViewModel @ViewModelInject() constructor(private val repository: StackExchangeRepository): ViewModel() {

    var questions: MutableLiveData<PagingData<Question>> = MutableLiveData()
    val coroutineContext = SupervisorJob() + IO
    var allJob: Job = Job()
    var filteredJob: Job = Job()

    fun fetchAllQuestions(){
        filteredJob.cancel()
        allJob = viewModelScope.launch {
            withContext(coroutineContext) {
                repository.fetchQuestions()
                    .cachedIn(viewModelScope)
                    .collectLatest { questions.postValue(it) }
            }
        }

    }

    fun fetchFilteredQuestionsByIsAnswered(isAnswered: Boolean) {
        allJob.cancel()
        filteredJob = viewModelScope.launch {
            repository.getFilteredQuestionsByIsAnswered(isAnswered)
                .cachedIn(viewModelScope)
                .collectLatest { questions.postValue(it) }
        }
    }

    fun filteredQuestionsByIsAnswered(isAnswered: Boolean): LiveData<List<Question>> {
        return repository.getFilteredQuestionsLiveDataByIsAnswered(isAnswered)
    }
}