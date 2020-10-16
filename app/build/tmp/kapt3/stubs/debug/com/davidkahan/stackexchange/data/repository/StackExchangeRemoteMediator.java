package com.davidkahan.stackexchange.data.repository;

import java.lang.System;

/**
 * Created by David Kahan on 15/10/2020.
 */
@kotlin.OptIn(markerClass = {androidx.paging.ExperimentalPagingApi.class})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ-\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/davidkahan/stackexchange/data/repository/StackExchangeRemoteMediator;", "Landroidx/paging/RemoteMediator;", "", "Lcom/davidkahan/stackexchange/datamodels/Question;", "stackExchangeApiService", "Lcom/davidkahan/stackexchange/data/network/StackExchangeApiService;", "stackExchangeDatabase", "Lcom/davidkahan/stackexchange/data/database/StackExchangeDatabase;", "(Lcom/davidkahan/stackexchange/data/network/StackExchangeApiService;Lcom/davidkahan/stackexchange/data/database/StackExchangeDatabase;)V", "load", "Landroidx/paging/RemoteMediator$MediatorResult;", "loadType", "Landroidx/paging/LoadType;", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/LoadType;Landroidx/paging/PagingState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class StackExchangeRemoteMediator extends androidx.paging.RemoteMediator<java.lang.Integer, com.davidkahan.stackexchange.datamodels.Question> {
    private final com.davidkahan.stackexchange.data.network.StackExchangeApiService stackExchangeApiService = null;
    private final com.davidkahan.stackexchange.data.database.StackExchangeDatabase stackExchangeDatabase = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object load(@org.jetbrains.annotations.NotNull()
    androidx.paging.LoadType loadType, @org.jetbrains.annotations.NotNull()
    androidx.paging.PagingState<java.lang.Integer, com.davidkahan.stackexchange.datamodels.Question> state, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.paging.RemoteMediator.MediatorResult> p2) {
        return null;
    }
    
    public StackExchangeRemoteMediator(@org.jetbrains.annotations.NotNull()
    com.davidkahan.stackexchange.data.network.StackExchangeApiService stackExchangeApiService, @org.jetbrains.annotations.NotNull()
    com.davidkahan.stackexchange.data.database.StackExchangeDatabase stackExchangeDatabase) {
        super();
    }
}