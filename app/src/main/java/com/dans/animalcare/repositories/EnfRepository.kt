package com.dans.animalcare.repositories

import androidx.lifecycle.LiveData
import com.dans.animalcare.database.daos.enferm_dao
import com.dans.animalcare.database.entities.enfermedad_entity
import com.dans.animalcare.service.retrofit.ApiService
import kotlinx.coroutines.Deferred
import retrofit2.Response

class EnfRepository (private val enfDao: enferm_dao) {


    val allEnfermedades: LiveData<List<enfermedad_entity>> = enfDao.getAllEnfermedades()


    fun retrieveEnfByName(enfermedad: String): Deferred<Response<LiveData<List<enfermedad_entity>>>> {
        return ApiService.getAnimalService().getEnf(enfermedad)
    }

    fun retrieveEnfs(): Deferred<Response<List<enfermedad_entity>>> {
        return ApiService.getAnimalService().getEnfs()
    }
}