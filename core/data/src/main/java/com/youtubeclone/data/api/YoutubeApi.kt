package com.youtubeclone.data.api

import com.youtubeclone.data.BuildConfig
import com.youtubeclone.data.model.YoutubeDataResponse
import retrofit2.http.GET
import retrofit2.http.Query
internal interface YoutubeApi {
    @GET("youtube/v3/search")
    suspend fun getVideos(
        @Query("part") part : String = "snippet",
        @Query("q") q : String,  //검색할 키워드
        @Query("maxResult") maxResult : Int = 10,
        @Query("type") type : String = "video",
        @Query("videoDuration") videoDuration : String,
        @Query("key") key: String =  BuildConfig.YOUTUBE_API_KEY,
    ) : YoutubeDataResponse


}