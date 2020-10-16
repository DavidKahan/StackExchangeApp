package com.davidkahan.stackexchange.data.repository;

import java.lang.System;

/**
 * Created by David Kahan on 15/10/2020.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\fH\u0016J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bJ\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/davidkahan/stackexchange/data/repository/StackExchangeRepository;", "Lcom/davidkahan/stackexchange/data/repository/StackExRepositoryProtocol;", "stackExchangeApiService", "Lcom/davidkahan/stackexchange/data/network/StackExchangeApiService;", "stackExchangeDatabase", "Lcom/davidkahan/stackexchange/data/database/StackExchangeDatabase;", "(Lcom/davidkahan/stackexchange/data/network/StackExchangeApiService;Lcom/davidkahan/stackexchange/data/database/StackExchangeDatabase;)V", "filteredQuestions", "Landroidx/lifecycle/LiveData;", "", "Lcom/davidkahan/stackexchange/datamodels/Question;", "fetchQuestions", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "getFilteredQuestionsByIsAnswered", "isAnswered", "", "getFilteredQuestionsLiveDataByIsAnswered", "refresh", "", "app_debug"})
public final class StackExchangeRepository implements com.davidkahan.stackexchange.data.repository.StackExRepositoryProtocol {
    private androidx.lifecycle.LiveData<java.util.List<com.davidkahan.stackexchange.datamodels.Question>> filteredQuestions;
    private final com.davidkahan.stackexchange.data.network.StackExchangeApiService stackExchangeApiService = null;
    private final com.davidkahan.stackexchange.data.database.StackExchangeDatabase stackExchangeDatabase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.davidkahan.stackexchange.datamodels.Question>> filteredQuestions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.OptIn(markerClass = {androidx.paging.ExperimentalPagingApi.class})
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.davidkahan.stackexchange.datamodels.Question>> fetchQuestions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.davidkahan.stackexchange.datamodels.Question>> getFilteredQuestionsByIsAnswered(boolean isAnswered) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.davidkahan.stackexchange.datamodels.Question>> getFilteredQuestionsLiveDataByIsAnswered(boolean isAnswered) {
        return null;
    }
    
    @java.lang.Override()
    public void refresh() {
    }
    
    public StackExchangeRepository(@org.jetbrains.annotations.NotNull()
    com.davidkahan.stackexchange.data.network.StackExchangeApiService stackExchangeApiService, @org.jetbrains.annotations.NotNull()
    com.davidkahan.stackexchange.data.database.StackExchangeDatabase stackExchangeDatabase) {
        super();
    }
}