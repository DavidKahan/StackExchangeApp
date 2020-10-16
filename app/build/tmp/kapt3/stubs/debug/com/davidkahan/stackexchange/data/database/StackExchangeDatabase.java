package com.davidkahan.stackexchange.data.database;

import java.lang.System;

/**
 * Created by David Kahan on 15/10/2020.
 */
@androidx.room.Database(entities = {com.davidkahan.stackexchange.datamodels.Question.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/davidkahan/stackexchange/data/database/StackExchangeDatabase;", "Landroidx/room/RoomDatabase;", "()V", "stackExchangeDao", "Lcom/davidkahan/stackexchange/data/database/StackExchangeDao;", "Companion", "app_debug"})
public abstract class StackExchangeDatabase extends androidx.room.RoomDatabase {
    private static volatile com.davidkahan.stackexchange.data.database.StackExchangeDatabase INSTANCE;
    public static final com.davidkahan.stackexchange.data.database.StackExchangeDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.davidkahan.stackexchange.data.database.StackExchangeDao stackExchangeDao();
    
    public StackExchangeDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/davidkahan/stackexchange/data/database/StackExchangeDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/davidkahan/stackexchange/data/database/StackExchangeDatabase;", "getDatabase", "context", "Landroid/content/Context;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.davidkahan.stackexchange.data.database.StackExchangeDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        kotlinx.coroutines.CoroutineScope scope) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}