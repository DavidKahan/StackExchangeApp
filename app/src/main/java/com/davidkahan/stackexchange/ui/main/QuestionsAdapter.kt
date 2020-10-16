package com.davidkahan.stackexchange.ui.main

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.RecyclerView
import com.davidkahan.stackexchange.R
import com.davidkahan.stackexchange.datamodels.Question
import com.davidkahan.stackexchange.ui.question.QuestionActivity
import com.davidkahan.stackexchange.utils.DiffUtilCallBack
import kotlinx.android.synthetic.main.adapter_row.view.*
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by David Kahan on 14/10/2020.
 */
class QuestionsAdapter: PagingDataAdapter<Question, QuestionsAdapter.QuestionViewHolder>(DiffUtilCallBack()) {

    override fun onBindViewHolder(holder: QuestionViewHolder, position: Int) {
        getItem(position)?.let { holder.bindQuestion(it) }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestionViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_row, parent, false)
        return QuestionViewHolder(view)
    }

    class QuestionViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        private val titleText: TextView = itemView.title
        private val scoreText: TextView = itemView.score
        private val creationDateText: TextView = itemView.creationDate
        private val isAnsweredImage: ImageView = itemView.hasAnswerIcon


        fun bindQuestion(question: Question) {
            with(question) {
                val simpleDateFormat = SimpleDateFormat("dd/MM/yyyy hh:mm:ss")
                val date = Date(creationDate * 1000)
                scoreText.text = score.toString()
                creationDateText.text = date.toString()
                creationDateText.text = simpleDateFormat.format(date)
                titleText.text = title
                if (question.isAnswered){
                    isAnsweredImage.visibility = View.VISIBLE
                } else {
                    isAnsweredImage.visibility = View.INVISIBLE
                }
                itemView.setOnClickListener{
                    val intent = Intent(itemView.context, QuestionActivity::class.java)
                    intent.putExtra("url",question.link)
                    itemView.context.startActivity(intent)
                }
            }
        }


    }

}
