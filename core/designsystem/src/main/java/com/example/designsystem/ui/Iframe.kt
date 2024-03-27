package com.example.designsystem.ui

import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun IframePlayer(video: String) {
    AndroidView(
        modifier = Modifier.fillMaxSize(),
        factory = { context ->
            WebView(context).apply {
                settings.javaScriptEnabled = true
                webViewClient = WebViewClient()
                loadData(
                    "<iframe " +
                            "width=\"100%\" " +
                            "height=\"100%\" " +
                            "src=\"$video" +
                            "title=\"YouTube video player\" " +
                            "frameborder=\"0\" " +
                            "allow=\"accelerometer; " +
                            "autoplay; " +
                            "clipboard-write; " +
                            "encrypted-media; " +
                            "gyroscope; " +
                            "picture-in-picture; " +
                            "web-share\" " +
                            "allowfullscreen>" +
                            "</iframe>",
                    "text/html",
                    "utf-8"
                )
            }
        })
}