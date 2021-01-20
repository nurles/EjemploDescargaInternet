package com.cbellmont.ejemplodescargainternet

import com.google.gson.annotations.SerializedName

data class Film(
    /*var title: String,
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
    @SerializedName("characters")var charactersUrls: List<String>?)*/
    var name : String,
    @SerializedName("birth_year")var birthYear : String,
    @SerializedName("eye_color")var eyeColor : String,
    var gender : String,
    @SerializedName("hair_color")var hairColor : String,
    var height : String,
    var mass : String,
    @SerializedName("skin_color")var skinColor : String,
    @SerializedName("species") val speciesUrls: List<String>?,
    @SerializedName("films") val filmsUrls: List<String>?
    )
     {


    override fun toString(): String {
        return "$name, especies: $speciesUrls, peliculas: $filmsUrls\n"
    }
}

