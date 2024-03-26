package com.youtubeclone.domain.usecase

import com.youtubeclone.data.repository.YoutubeRepository
import com.youtubeclone.model.YoutubeData
import javax.inject.Inject

class GetVideosUseCase @Inject constructor(
    private val youtubeRepository: YoutubeRepository,
) {
    suspend operator fun invoke(q: String, videoDuration: String) : YoutubeData {
        return youtubeRepository.getVideos(q,videoDuration)
    }
}