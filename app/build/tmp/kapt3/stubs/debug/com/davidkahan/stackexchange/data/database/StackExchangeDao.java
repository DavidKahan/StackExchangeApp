package com.davidkahan.stackexchange.data.database;

import java.lang.System;

/**
 * Created by David Kahan on 15/10/2020.
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\'J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\t\u001a\u00020\nH\'J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\f2\u0006\u0010\t\u001a\u00020\nH\'J\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'\u00a8\u0006\u0010"}, d2 = {"Lcom/davidkahan/stackexchange/data/database/StackExchangeDao;", "", "getAllLocalQuestions", "", "Lcom/davidkahan/stackexchange/datamodels/Question;", "getAllQuestions", "Landroidx/paging/PagingSource;", "", "getFilteredQuestionsByIsAnswered", "isAnswered", "", "getFilteredQuestionsLiveDataByIsAnswered", "Landroidx/lifecycle/LiveData;", "insertQuestions", "", "questions", "app_debug"})
public abstract interface StackExchangeDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertQuestions(@org.jetbrains.annotations.NotNull()
    java.util.List<com.davidkahan.stackexchange.datamodels.Question> questions);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM questions_table ORDER BY creationDate DESC")
    public abstract androidx.paging.PagingSource<java.lang.Integer, com.davidkahan.stackexchange.datamodels.Question> getAllQuestions();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM questions_table WHERE isAnswered = :isAnswered ORDER BY creationDate DESC")
    public abstract androidx.paging.PagingSource<java.lang.Integer, com.davidkahan.stackexchange.datamodels.Question> getFilteredQuestionsByIsAnswered(boolean isAnswered);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM questions_table WHERE isAnswered = :isAnswered ORDER BY creationDate DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.davidkahan.stackexchange.datamodels.Question>> getFilteredQuestionsLiveDataByIsAnswered(boolean isAnswered);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM questions_table ORDER BY creationDate DESC")
    @androidx.annotation.VisibleForTesting()
    public abstract java.util.List<com.davidkahan.stackexchange.datamodels.Question> getAllLocalQuestions();
}