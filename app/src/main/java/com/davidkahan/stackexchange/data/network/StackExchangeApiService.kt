package com.davidkahan.stackexchange.data.network

import com.davidkahan.stackexchange.datamodels.QuestionsResponse
import okhttp3.HttpUrl
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query


/**
 * Created by David Kahan on 15/10/2020.
 */
private const val BASE_URL = "https://api.stackexchange.com/"
private const val STACKEXCHANGE_KEY = "eB25EDL8G*)sMsbUDZyQtg(("

private val retrofit = Retrofit.Builder()
        .baseUrl(HttpUrl.parse(BASE_URL)!!)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

interface StackExchangeApiService {
    @GET("/2.2/questions?order=desc&sort=activity&site=stackoverflow")
    suspend fun getQuestions(@Query("pagesize") pagesize: Int = 30, @Query("key") key: String = STACKEXCHANGE_KEY): QuestionsResponse
}

/**
 * A public Api object that exposes the lazy-initialized Retrofit service
 */
object StackExchangeApi {
    val stackExchangeApiService : StackExchangeApiService by lazy { retrofit.create(StackExchangeApiService::class.java) }
}