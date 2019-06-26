package com.dans.animalcare.repositories

import androidx.lifecycle.LiveData
import com.dans.animalcare.database.daos.raza_dao
import com.dans.animalcare.database.entities.raza_entity
import com.dans.animalcare.service.retrofit.ApiService
import com.dans.animalcare.service.retrofit.Especie
import kotlinx.coroutines.Deferred
import retrofit2.Response

class RazaRepository(private val razaDao: raza_dao) {


    val allRazas: LiveData<List<raza_entity>> = razaDao.getAllRazas()


    fun retrieveRazaByNombre(nombre: String): Deferred<Response<LiveData<List<raza_entity>>>> {
        return ApiService.getAnimalService().getRaza(nombre)
    }

    fun retrieveRazas(nombreEspecie:String): Deferred<Response<List<Especie>>> {
        return ApiService.getAnimalService().getRazas(nombreEspecie)
    }
}