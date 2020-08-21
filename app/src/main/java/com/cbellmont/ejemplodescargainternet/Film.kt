package com.cbellmont.ejemplodescargainternet

import com.google.gson.annotations.SerializedName

data class Film(
    var title: String,
    @SerializedName("episode_id")var episodeId : Int,
    @SerializedName("opening_crawl")var openingCrawl: String,
    var director: String,
    var producer: String,
    var url: String,
    var created: String,
    var edited: String,
    @SerializedName("species") val speciesUrls: List<String>?,
    @SerializedName("starships")  var starshipsUrls: List<String>?,
    @SerializedName("vehicles") var vehiclesUrls: List<String>?,
    @SerializedName("planets")var planetsUrls: List<String>?,
    @SerializedName("characters")var charactersUrls: List<String>?) {

    override fun toString(): String {
        return "$title, directed by $director in $created\n"
    }
}

