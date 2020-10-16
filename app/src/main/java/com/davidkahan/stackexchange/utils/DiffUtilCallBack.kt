package com.davidkahan.stackexchange.utils

import androidx.recyclerview.widget.DiffUtil
import com.davidkahan.stackexchange.datamodels.Question

/**
 * Created by David Kahan on 15/10/2020.
 */
class DiffUtilCallBack : DiffUtil.ItemCallback<Question>() {
    override fun areItemsTheSame(oldItem: Question, newItem: Question): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Question, newItem: Question): Boolean {
        return oldItem.id == newItem.id
                && oldItem.score == newItem.score
                && oldItem.viewCount == newItem.viewCount
    }

}