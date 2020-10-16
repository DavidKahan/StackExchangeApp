package com.davidkahan.stackexchange.datamodels

import com.google.gson.annotations.SerializedName

data class QuestionsResponse(
    @SerializedName("items") var questions: ArrayList<Question>?,
    @SerializedName("has_more") var hasMore: Boolean,
    @SerializedName("backoff") var backoff: Int
)