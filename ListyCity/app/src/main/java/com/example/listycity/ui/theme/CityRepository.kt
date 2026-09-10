package com.example.listycity

class CityRepository{
    //Keep mutable app data private so other classes cannot change it directly
    private val _cities = mutableListOf(
        "Edmonton", "Vancouver", "Moscow,",
        "Sydney", "Berlin", "Vienna",
        "Tokyo", "Beijing", "Osaka",
        "New Delhi"
    )

    // Get a readonly list for the UI to display
    val cities: List<String>
        get() = _cities

    fun addCity(city: String){
        _cities.add(city)
    }

    fun removeCity(city: String){
        _cities.remove(city)
    }
}