package com.davidkahan.stackexchange.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.paging.*
import com.davidkahan.stackexchange.data.database.StackExchangeDatabase
import com.davidkahan.stackexchange.data.network.StackExchangeApiService
import com.davidkahan.stackexchange.datamodels.Question
import kotlinx.coroutines.flow.Flow

/**
 * Created by David Kahan on 15/10/2020.
 */
class StackExchangeRepository(private val stackExchangeApiService: StackExchangeApiService, private val stackExchangeDatabase: StackExchangeDatabase): StackExRepositoryProtocol {

    private lateinit var filteredQuestions: LiveData<List<Question>>
    fun filteredQuestions() = filteredQuestions

    @OptIn(ExperimentalPagingApi::class)
    override fun fetchQuestions(): Flow<PagingData<Question>> {
        return Pager(
            PagingConfig(pageSize = 40, enablePlaceholders = false, prefetchDistance = 20),
            remoteMediator = StackExchangeRemoteMediator(stackExchangeApiService, stackExchangeDatabase),
            pagingSourceFactory = { stackExchangeDatabase.stackExchangeDao().getAllQuestions() }
        ).flow
    }

    override fun getFilteredQuestionsByIsAnswered(isAnswered: Boolean): Flow<PagingData<Question>> {
        return Pager(
            PagingConfig(pageSize = 10, enablePlaceholders = false, prefetchDistance = 5),
            pagingSourceFactory = { stackExchangeDatabase.stackExchangeDao().getFilteredQuestionsByIsAnswered(isAnswered) }
        ).flow
    }

    fun getFilteredQuestionsLiveDataByIsAnswered(isAnswered: Boolean): LiveData<List<Question>> {
        filteredQuestions = stackExchangeDatabase.stackExchangeDao().getFilteredQuestionsLiveDataByIsAnswered(isAnswered)
        return stackExchangeDatabase.stackExchangeDao().getFilteredQuestionsLiveDataByIsAnswered(isAnswered)
    }

    override fun refresh(){
        stackExchangeDatabase.stackExchangeDao().getAllQuestions().invalidate()
    }
}