package com.youtubeclone.data.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class YoutubeResponse(
    @SerialName("etag")
    val etag: String?,
    @SerialName("items")
    val items: List<Item?>?,
    @SerialName("kind")
    val kind: String?,
    @SerialName("nextPageToken")
    val nextPageToken: String?,
    @SerialName("pageInfo")
    val pageInfo: PageInfo?,
    @SerialName("regionCode")
    val regionCode: String?
) {
    @Serializable
    data class Item(
        @SerialName("etag")
        val etag: String?,
        @SerialName("id")
        val id: Id?,
        @SerialName("kind")
        val kind: String?,
        @SerialName("snippet")
        val snippet: Snippet?
    ) {
        @Serializable
        data class Id(
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
        data class Snippet(
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
            val thumbnails: Thumbnails?,
            @SerialName("title")
            val title: String?
        ) {
            @Serializable
            data class Thumbnails(
                @SerialName("default")
                val default: Default?,
                @SerialName("high")
                val high: High?,
                @SerialName("medium")
                val medium: Medium?
            ) {
                @Serializable
                data class Default(
                    @SerialName("height")
                    val height: Int?,
                    @SerialName("url")
                    val url: String?,
                    @SerialName("width")
                    val width: Int?
                )

                @Serializable
                data class High(
                    @SerialName("height")
                    val height: Int?,
                    @SerialName("url")
                    val url: String?,
                    @SerialName("width")
                    val width: Int?
                )

                @Serializable
                data class Medium(
                    @SerialName("height")
                    val height: Int?,
                    @SerialName("url")
                    val url: String?,
                    @SerialName("width")
                    val width: Int?
                )
            }
        }
    }

    @Serializable
    data class PageInfo(
        @SerialName("resultsPerPage")
        val resultsPerPage: Int?,
        @SerialName("totalResults")
        val totalResults: Int?
    )
}