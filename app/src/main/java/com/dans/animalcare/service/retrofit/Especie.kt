package com.dans.animalcare.service.retrofit

import com.dans.animalcare.database.entities.raza_entity
import com.squareup.moshi.Json

class Especie(
    @Json(name = "_id")
    val _id:String,
    @Json(name = "nombreEspecie")
    val nombreEspecie:String,
    @Json(name = "raza")
    val raza:MutableList<raza_entity>
)