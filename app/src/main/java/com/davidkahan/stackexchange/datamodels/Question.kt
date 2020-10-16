package com.davidkahan.stackexchange.datamodels

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.davidkahan.stackexchange.utils.Constants
import com.google.gson.annotations.SerializedName

@Entity (tableName = Constants.QUESTIONS_TABLE_NAME)
data class Question(
    @PrimaryKey @SerializedName("question_id")
    val id: Int,
//    @SerializedName("owner")
//    val owner: Owner,
    @SerializedName("is_answered")
    val isAnswered: Boolean,
    @SerializedName("title")
    val title: String,
    @SerializedName("score")
    val score: Int,
    @SerializedName("answer_count")
    val answerCount: Int = 0,
    @SerializedName("last_activity_date")
    val lastActivityDate: Long,
    @SerializedName("creation_date")
    val creationDate: Long,
    @SerializedName("view_count")
    val viewCount: Int = 0,
    @SerializedName("link")
    val link: String
)