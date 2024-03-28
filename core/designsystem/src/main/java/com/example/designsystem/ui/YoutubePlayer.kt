package com.example.designsystem.ui

import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun YoutubePlayer(video: String, modifier: Modifier) {
    AndroidView(
        modifier = modifier,
        factory = { context ->
            val webView = WebView(context).apply {
                layoutParams = ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
                )
                settings.javaScriptEnabled = true
                settings.loadWithOverviewMode = true
                settings.useWideViewPort = true
                webChromeClient = WebChromeClient()
            }

            val video =
                "<iframe " +
                        "width=\"100%\" " +
                        "height=\"100%\" " +
                        "src=\"https://www.youtube.com/embed/$video\"" +
                        "title=\"test Video Title\" " +
                        "frameborder=\"0\" " +
                        "allow=\"accelerometer; " +
                        "autoplay;" +
                        "clipboard-write; " +
                        "encrypted-media; " +
                        "gyroscope;" +
                        "picture-in-picture; " +
                        "web-share\" " +
                        "allowfullscreen>" +
                        "</iframe>"
            webView.loadData(video, "text/html", "utf-8")
            webView
        }
    )
}