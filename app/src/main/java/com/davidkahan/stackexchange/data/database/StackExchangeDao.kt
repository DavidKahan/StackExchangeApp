package com.davidkahan.stackexchange.data.database

import androidx.annotation.VisibleForTesting
import androidx.lifecycle.LiveData
import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.davidkahan.stackexchange.datamodels.Question
import com.davidkahan.stackexchange.utils.Constants

/**
 * Created by David Kahan on 15/10/2020.
 */
@Dao
interface StackExchangeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertQuestions(questions: List<Question>)

    //ORDER BY key ASC
    @Query("SELECT * FROM ${Constants.QUESTIONS_TABLE_NAME} ORDER BY creationDate DESC")
    fun getAllQuestions(): PagingSource<Int, Question>

    @Query("SELECT * FROM ${Constants.QUESTIONS_TABLE_NAME} WHERE isAnswered = :isAnswered ORDER BY creationDate DESC")
    fun getFilteredQuestionsByIsAnswered(isAnswered: Boolean): PagingSource<Int, Question>

    @Query("SELECT * FROM ${Constants.QUESTIONS_TABLE_NAME} WHERE isAnswered = :isAnswered ORDER BY creationDate DESC")
    fun getFilteredQuestionsLiveDataByIsAnswered(isAnswered: Boolean): LiveData<List<Question>>

    @VisibleForTesting
    @Query("SELECT * FROM ${Constants.QUESTIONS_TABLE_NAME} ORDER BY creationDate DESC")
    fun getAllLocalQuestions(): List<Question>
}