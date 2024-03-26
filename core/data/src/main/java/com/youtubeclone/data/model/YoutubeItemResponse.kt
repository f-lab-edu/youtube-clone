package com.youtubeclone.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class YoutubeItemResponse(
    @SerialName("etag")
    val etag: String?,
    @SerialName("id")
    val id: IdResponse?,
    @SerialName("kind")
    val kind: String?,
    @SerialName("snippet")
    val snippet: SnippetResponse?
)
@Serializable
data class IdResponse(
    @SerialName("channelId")
    val channelId: String?,
    @SerialName("kind")
    val kind: String?,
    @SerialName("playlistId")
    val playlistId: String?,
    @SerialName("videoId")
    val videoId: String?
)
@Serializable
data class SnippetResponse(
    @SerialName("channelId")
    val channelId: String?,
    @SerialName("channelTitle")
    val channelTitle: String?,
    @SerialName("description")
    val description: String?,
    @SerialName("liveBroadcastContent")
    val liveBroadcastContent: String?,
    @SerialName("publishTime")
    val publishTime: String?,
    @SerialName("publishedAt")
    val publishedAt: String?,
    @SerialName("thumbnails")
    val thumbnails: ThumbnailsResponse?,
    @SerialName("title")
    val title: String?
)
@Serializable
data class ThumbnailsResponse(
    @SerialName("default")
    val default: SizeResponse?,
    @SerialName("high")
    val high: SizeResponse?,
    @SerialName("medium")
    val medium: SizeResponse?
)
@Serializable
data class SizeResponse(
    val height: Int?,
    val url: String?,
    val width: Int?,
)