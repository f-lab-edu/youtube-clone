package com.youtubeclone.data.model


import com.youtubeclone.data.model.mapper.toData
import com.youtubeclone.model.YoutubeData
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class YoutubeDataResponse(
    @SerialName("items")
    val items: List<YoutubeItemResponse?>?,
)

