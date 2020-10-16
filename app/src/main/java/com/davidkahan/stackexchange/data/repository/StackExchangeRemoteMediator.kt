package com.davidkahan.stackexchange.data.repository

import androidx.paging.ExperimentalPagingApi
import androidx.paging.LoadType
import androidx.paging.PagingState
import androidx.paging.RemoteMediator
import androidx.room.withTransaction
import com.davidkahan.stackexchange.data.database.StackExchangeDatabase
import com.davidkahan.stackexchange.data.network.StackExchangeApiService
import com.davidkahan.stackexchange.datamodels.Question
import retrofit2.HttpException
import java.io.IOException

/**
 * Created by David Kahan on 15/10/2020.
 */
@OptIn(ExperimentalPagingApi::class)
class StackExchangeRemoteMediator(
    private val stackExchangeApiService: StackExchangeApiService,
    private val stackExchangeDatabase: StackExchangeDatabase
) : RemoteMediator<Int, Question>() {
    override suspend fun load(
        loadType: LoadType,
        state: PagingState<Int, Question>
    ): MediatorResult {
        return try {
            val loadKey = when(loadType){
                LoadType.REFRESH -> null
                LoadType.PREPEND -> return MediatorResult.Success(endOfPaginationReached = true)
                LoadType.APPEND ->{
                    state.lastItemOrNull()
                        ?: return MediatorResult.Success(endOfPaginationReached = true)
                }
            }
            val response = stackExchangeApiService.getQuestions(
                pagesize = state.config.pageSize
            )

            val stackExchangeQuestions = response.questions

            if (stackExchangeQuestions != null) {
                stackExchangeDatabase.withTransaction {
                    stackExchangeDatabase.stackExchangeDao().insertQuestions(stackExchangeQuestions)
                }

            }
            MediatorResult.Success(endOfPaginationReached = response.hasMore)

        } catch (exception: IOException) {
            MediatorResult.Error(exception)
        } catch (exception: HttpException) {
            MediatorResult.Error(exception)
        }

    }

}
