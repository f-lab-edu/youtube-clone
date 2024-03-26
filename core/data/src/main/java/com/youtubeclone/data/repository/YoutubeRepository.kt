package com.youtubeclone.data.repository

import com.youtubeclone.data.model.YoutubeDataResponse
import com.youtubeclone.model.YoutubeData

interface YoutubeRepository {
    suspend fun getVideos(q: String, videoDuration: String): YoutubeData
}