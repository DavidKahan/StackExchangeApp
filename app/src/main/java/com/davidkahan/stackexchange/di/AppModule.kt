package com.davidkahan.stackexchange.di

import android.content.Context
import com.davidkahan.stackexchange.data.database.StackExchangeDao
import com.davidkahan.stackexchange.data.database.StackExchangeDatabase
import com.davidkahan.stackexchange.data.network.StackExchangeApi
import com.davidkahan.stackexchange.data.network.StackExchangeApiService
import com.davidkahan.stackexchange.data.repository.StackExchangeRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

/**
 * Created by David Kahan on 19/10/2020.
 */
@InstallIn(ApplicationComponent::class)
@Module
object AppModule {

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext appContext: Context) = StackExchangeDatabase.getDatabase(appContext)

    @Provides
    fun provideStackExchangeApiService() = StackExchangeApi.stackExchangeApiService

    @Singleton
    @Provides
    fun provideRepository(remoteDataSource: StackExchangeApiService,
                          localDataSource: StackExchangeDatabase) =
        StackExchangeRepository(remoteDataSource, localDataSource)


    @Singleton
    @Provides
    fun provideStackExchangeDao(database: StackExchangeDatabase): StackExchangeDao = database.stackExchangeDao()
}