package com.youtubeclone.shorts



import android.widget.Space
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.designsystem.ui.YoutubePlayer

@Composable
fun ShortsScreen() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        YoutubePlayer(video = "https://www.youtube.com/embed/5d19HVG2Oz8")
        Spacer(modifier = Modifier.height(10.dp))
        Box(modifier = Modifier.height(20.dp))
//        Text(
//            text = "this is ShortsScreen"
//        )
    }
}