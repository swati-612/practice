package com.example.practis

import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var webview: WebView? = null
    private var searchView: SearchView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        webview = findViewById(R.id.webview) as WebView
        webview!!.webViewClient = WebViewClient()
        searchView = findViewById(R.id.searchview) as SearchView
        searchView!!.setOnQueryTextListener(object : setOnQueryTextListener() {
            fun onQueryTextSubmit(query: String?): Boolean {
                webview!!.loadUrl("https://www.google,com/search?q=" + searchView!!.query)
                return false
            }

            fun onQueryTextChange(newText: String?): Boolean {
                return false
            }
        })
    }
}