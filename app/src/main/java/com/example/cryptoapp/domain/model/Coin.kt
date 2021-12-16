package com.example.cryptoapp.domain.model

import com.google.gson.annotations.SerializedName

// The actual data class we will use to display coin data
// on our list
data class Coin(

    val id: String,
    val is_active: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
)