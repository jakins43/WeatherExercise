package com.example.weatherexercise.model


import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@JsonClass(generateAdapter = true)
@Parcelize
data class Clouds(
    @Json(name = "all")
    val all: Double?
): Parcelable