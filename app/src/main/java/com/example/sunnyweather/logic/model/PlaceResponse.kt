package com.example.sunnyweather.logic.model

import com.google.gson.annotations.SerializedName

data class PlaceResponse(val status: String,val places: List<PLace>)

data class PLace(val name: String,val location: Location,
    @SerializedName("formatted_address") val address: String)

data class Location(val lng:String,val lat: String)