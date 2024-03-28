package com.example.designsystem.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.ui.platform.ComposeView
import com.youtubeclone.designsystem.R

class iframeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iframe)

        val youtubePlayer= findViewById<ComposeView>(R.id.youtubeIframeView)
        youtubePlayer.setContent {
            YoutubePlayer(video = "hihi")
        }
    }
}