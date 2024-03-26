package com.youtubeclone.data.repository

import com.youtubeclone.data.api.YoutubeApi
import com.youtubeclone.data.model.YoutubeDataResponse
import javax.inject.Inject

internal class YoutubeRepositoryImpl @Inject constructor(
    private val youtubeApi: YoutubeApi,
) : YoutubeRepository{
    override suspend fun getVideos(q: String, videoDuration: String): YoutubeDataResponse {
        return youtubeApi.getVideos(q = q, videoDuration = videoDuration)
    }
}