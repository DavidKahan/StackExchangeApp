package com.davidkahan.stackexchange.data.repository

import androidx.paging.PagingData
import com.davidkahan.stackexchange.datamodels.Question
import kotlinx.coroutines.flow.Flow

/**
 * Created by David Kahan on 15/10/2020.
 */
interface StackExRepositoryProtocol {
    fun fetchQuestions(): Flow<PagingData<Question>>
    fun getFilteredQuestionsByIsAnswered(isAnswered: Boolean): Flow<PagingData<Question>>
    fun refresh()
}