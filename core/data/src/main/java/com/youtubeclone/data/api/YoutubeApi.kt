package com.youtubeclone.data.api

import com.youtubeclone.data.BuildConfig
import com.youtubeclone.data.model.YoutubeResponse
import retrofit2.http.GET
import retrofit2.http.Query
internal interface YoutubeApi {
    @GET("search")
    suspend fun getVideo(
        @Query("part") part : String = "snippet",
        @Query("q") q : String,  //검색할 키워드
        @Query("maxResult") maxResult : Int = 10,
        @Query("key") key: String =  BuildConfig.YOUTUBE_API_KEY,
    ) : YoutubeResponse

    @GET("search")
    suspend fun getChannelVideo(
        @Query("part") part : String = "snippet",
        @Query("order") order : String = "date",
        @Query("channelId") channelId : String,
        @Query("maxResult") maxResult : Int = 10,
        @Query("key") key: String = BuildConfig.YOUTUBE_API_KEY,
    ) : YoutubeResponse

    @GET("playlistItems")
    suspend fun getPlayListVideo(
        @Query("part") part : String = "snippet",
        @Query("playlistId") playlistId : String,
        @Query("maxResult") maxResult : Int = 10,
        @Query("key") key: String =  BuildConfig.YOUTUBE_API_KEY,
    ) : YoutubeResponse
}