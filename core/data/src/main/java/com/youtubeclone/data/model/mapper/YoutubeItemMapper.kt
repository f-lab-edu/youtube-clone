package com.youtubeclone.data.model.mapper

import com.youtubeclone.data.model.IdResponse
import com.youtubeclone.data.model.SizeResponse
import com.youtubeclone.data.model.SnippetResponse
import com.youtubeclone.data.model.ThumbnailsResponse
import com.youtubeclone.data.model.YoutubeDataResponse
import com.youtubeclone.data.model.YoutubeItemResponse
import com.youtubeclone.model.Id
import com.youtubeclone.model.Size
import com.youtubeclone.model.Snippet
import com.youtubeclone.model.Thumbnails
import com.youtubeclone.model.YoutubeData
import com.youtubeclone.model.YoutubeItem

internal fun YoutubeDataResponse.toData(): YoutubeData =
    YoutubeData(
        items = items?.map { it?.toData() }
    )

internal fun YoutubeItemResponse.toData(): YoutubeItem =
    YoutubeItem(
        etag = etag,
        id = id?.toData(),
        kind = kind,
        snippet = snippet?.toData()
    )

internal fun IdResponse.toData(): Id =
    Id(
        channelId = channelId,
        kind = kind,
        playlistId = playlistId,
        videoId = videoId
    )

internal fun SnippetResponse.toData(): Snippet =
    Snippet(
        channelId = channelId,
        channelTitle = channelTitle,
        description = description,
        liveBroadcastContent = liveBroadcastContent,
        publishTime = publishTime,
        publishedAt = publishedAt,
        thumbnails = thumbnails?.toData(),
        title = title,
    )

internal fun ThumbnailsResponse.toData(): Thumbnails =
    Thumbnails(
        default = default?.toData(),
        high = high?.toData(),
        medium = medium?.toData()
    )


internal fun SizeResponse.toData(): Size =
    Size(
        height = height,
        url = url,
        width = width
    )