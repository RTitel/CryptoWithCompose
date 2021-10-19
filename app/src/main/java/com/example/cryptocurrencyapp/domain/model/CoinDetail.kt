package com.example.cryptocurrencyapp.domain.model

import com.example.cryptocurrencyapp.data.remote.dto.TeamMember
import com.google.gson.annotations.SerializedName

data class CoinDetail(
    val coinId: String,
    val description: String,
    val name: String,
    val symbol: String,
    val rank: Int,
    val isActive: Boolean,
    val tags: List<String>,
    val team: List<TeamMember>? = null
)
