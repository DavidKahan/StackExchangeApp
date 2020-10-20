package com.davidkahan.stackexchange.ui.main

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import com.davidkahan.stackexchange.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.collectLatest

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private var jobAll: Job? = null
    private var jobFiltered: Job? = null

    val questionsAdapter = QuestionsAdapter()
    private val mainViewModel: MainViewModel by lazy {
        ViewModelProvider(this).get(MainViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViews()
        fetchAllQuestions()
        initSwipeToRefresh()
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.all -> {
                fetchAllQuestions()
                true
            }
            R.id.answered -> {
                fetchFilteredQuestionsByIsAnswered(true)
                true
            }
            R.id.unanswered -> {
                fetchFilteredQuestionsByIsAnswered(false)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun initSwipeToRefresh() {
        swipeRefresh.setOnRefreshListener {
            fetchAllQuestions()
            swipeRefresh.isRefreshing = false
        }
    }



    private fun fetchAllQuestions() {
        jobAll = lifecycleScope.launch {
            jobFiltered?.cancel()
            mainViewModel.fetchAllQuestions().collectLatest { pagingData ->
                questionsAdapter.submitData(pagingData)
            }
        }
    }

    private fun fetchFilteredQuestionsByIsAnswered(isAnswered: Boolean) {
        jobFiltered = lifecycleScope.launch {
            jobAll?.cancel()
            mainViewModel.fetchFilteredQuestionsByIsAnswered(isAnswered).collectLatest { pagingData ->
                questionsAdapter.submitData(pagingData)
            }
        }
    }

    private fun setupViews() {
        questionsRecycler.adapter = questionsAdapter
        questionsRecycler.adapter = questionsAdapter.withLoadStateHeaderAndFooter(
            header = LoadingAdapter { questionsAdapter.retry() },
            footer = LoadingAdapter { questionsAdapter.retry() }
        )
    }
}