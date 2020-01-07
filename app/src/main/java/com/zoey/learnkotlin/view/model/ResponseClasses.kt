package com.zoey.learnkotlin.view.model

data class ForecastResult(
    val city: City?,
    val cod: String?,
    val message: Double?,
    val cnt: Int?,
    val list: List<Forecast>?
)

data class City(

    var id: Int?,
    var name: String?,
    var coord: Coordinates?,
    var country: String?,
    var population: Int?,
    var timezone: Int?

)

data class Coordinates(

    var lon: Double?,
    var lat: Double?
)

data class Forecast(

    var dt: Int?,
    var sunrise: Int?,
    var sunset: Int?,
    var temp: Temperature?,
    var feelsLike: FeelsLike?,
    var pressure: Int?,
    var humidity: Int?,
    var weather: List<Weather>?,
    var speed: Double?,
    var deg: Int?,
    var clouds: Int?,
    var rain: Double?

)

data class FeelsLike(

    var day: Double?,
    var night: Double?,
    var eve: Double?,
    var morn: Double?

)

data class Weather(

    var id: Int?,
    var main: String?,
    var description: String?,
    var icon: String?
)

data class Temperature(

    var day: Double?,
    var min: Double?,
    var max: Double?,
    var night: Double?,
    var eve: Double?,
    var morn: Double?
)