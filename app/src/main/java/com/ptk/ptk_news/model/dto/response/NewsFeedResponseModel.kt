package com.ptk.ptk_news.model.dto.response

import com.ptk.ptk_news.db.entity.ArticleEntity
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class NewsFeedResponseModel(

    @SerialName("totalResults")
    val totalResults: Int? = null,

    @SerialName("articles")
    val articles: List<ArticleEntity>? = null,

    @SerialName("status")
    val status: String? = null
)


