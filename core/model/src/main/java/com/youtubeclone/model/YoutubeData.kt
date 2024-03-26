package com.youtubeclone.model

data class YoutubeData(
    val etag: String?,
    val items: List<Item?>?,
    val kind: String?,
    val nextPageToken: String?,
    val pageInfo: PageInfo?,
    val regionCode: String?
) {
    
    data class Item(
        val etag: String?,
        val id: Id?,
        val kind: String?,
        val snippet: Snippet?
    ) {
        
        data class Id(
            val channelId: String?,
            val kind: String?,
            val playlistId: String?,
            val videoId: String?
        )

        
        data class Snippet(
            val channelId: String?,
            val channelTitle: String?,
            val description: String?,
            val liveBroadcastContent: String?,
            val publishTime: String?,
            val publishedAt: String?,
            val thumbnails: Thumbnails?,
            val title: String?
        ) {
            
            data class Thumbnails(
                val default: Default?,
                val high: High?,
                val medium: Medium?
            ) {
                
                data class Default(
                    val height: Int?,
                    val url: String?,
                    val width: Int?
                )

                
                data class High(
                    val height: Int?,
                    val url: String?,
                    val width: Int?
                )

                
                data class Medium(
                    val height: Int?,
                    val url: String?,
                    val width: Int?
                )
            }
        }
    }

    
    data class PageInfo(
        val resultsPerPage: Int?,
        val totalResults: Int?
    )
}