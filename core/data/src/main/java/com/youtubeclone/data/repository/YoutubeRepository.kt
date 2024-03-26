package com.youtubeclone.data.repository

import com.youtubeclone.data.model.YoutubeDataResponse

interface YoutubeRepository {
    suspend fun getVideos(q: String, videoDuration: String): YoutubeDataResponse
}