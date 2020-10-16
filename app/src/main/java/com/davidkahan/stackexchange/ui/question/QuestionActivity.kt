package com.davidkahan.stackexchange.ui.question

import android.graphics.Bitmap
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.davidkahan.stackexchange.R
import kotlinx.android.synthetic.main.activity_question.*


class QuestionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)
        val url = intent.getStringExtra("url")
        webView.webViewClient = QuestionViewClient()
        if (url != null) {
            webView.loadUrl(url)
        }
    }

    inner class QuestionViewClient : WebViewClient() {

        override fun onPageFinished(view: WebView, url: String) {
            super.onPageFinished(view, url)
            progressBar.visibility = View.GONE
            webView.visibility = View.VISIBLE
        }
    }
}