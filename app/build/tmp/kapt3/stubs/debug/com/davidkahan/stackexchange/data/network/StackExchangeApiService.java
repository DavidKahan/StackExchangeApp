package com.davidkahan.stackexchange.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/davidkahan/stackexchange/data/network/StackExchangeApiService;", "", "getQuestions", "Lcom/davidkahan/stackexchange/datamodels/QuestionsResponse;", "pagesize", "", "key", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface StackExchangeApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/2.2/questions?order=desc&sort=activity&site=stackoverflow")
    public abstract java.lang.Object getQuestions(@retrofit2.http.Query(value = "pagesize")
    int pagesize, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "key")
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.davidkahan.stackexchange.datamodels.QuestionsResponse> p2);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}