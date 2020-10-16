package com.davidkahan.stackexchange.data.repository;

import java.lang.System;

/**
 * Created by David Kahan on 15/10/2020.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u001c\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/davidkahan/stackexchange/data/repository/StackExRepositoryProtocol;", "", "fetchQuestions", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/davidkahan/stackexchange/datamodels/Question;", "getFilteredQuestionsByIsAnswered", "isAnswered", "", "refresh", "", "app_debug"})
public abstract interface StackExRepositoryProtocol {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.davidkahan.stackexchange.datamodels.Question>> fetchQuestions();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.davidkahan.stackexchange.datamodels.Question>> getFilteredQuestionsByIsAnswered(boolean isAnswered);
    
    public abstract void refresh();
}