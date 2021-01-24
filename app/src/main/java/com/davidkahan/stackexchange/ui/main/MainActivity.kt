package com.davidkahan.stackexchange.ui.main

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.observe
import com.davidkahan.stackexchange.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val questionsAdapter = QuestionsAdapter()
    private val mainViewModel: MainViewModel by lazy {
        ViewModelProvider(this).get(MainViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViews()
        initObservers()
        fetchAllQuestions()
        initSwipeToRefresh()
    }

    private fun initObservers() {
        mainViewModel.questions.observe(this){
            lifecycleScope.launch{
                questionsAdapter.submitData(it)
            }
        }
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
                mainViewModel.fetchFilteredQuestionsByIsAnswered(true)
                true
            }
            R.id.unanswered -> {
                mainViewModel.fetchFilteredQuestionsByIsAnswered(false)
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
        mainViewModel.fetchAllQuestions()
    }

    private fun setupViews() {
        questionsRecycler.adapter = questionsAdapter
        questionsRecycler.adapter = questionsAdapter.withLoadStateHeaderAndFooter(
            header = LoadingAdapter { questionsAdapter.retry() },
            footer = LoadingAdapter { questionsAdapter.retry() }
        )
    }
}