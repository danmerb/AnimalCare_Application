package com.dans.animalcare.repositories

import androidx.lifecycle.LiveData
import com.dans.animalcare.database.daos.vet_dao
import com.dans.animalcare.database.entities.vet_entity
import com.dans.animalcare.service.retrofit.ApiService
import kotlinx.coroutines.Deferred
import retrofit2.Response

class VetRepository (private val vetDao: vet_dao) {


    val allVets: LiveData<List<vet_entity>> = vetDao.getAllVets()

    fun retrieveVets(): Deferred<Response<List<vet_entity>>> {
        return ApiService.getAnimalService().getVets()
    }
}