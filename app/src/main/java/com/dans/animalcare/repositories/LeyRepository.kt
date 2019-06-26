package com.dans.animalcare.repositories

import androidx.lifecycle.LiveData
import com.dans.animalcare.database.daos.ley_dao
import com.dans.animalcare.database.entities.ley_entity
import com.dans.animalcare.service.retrofit.ApiService
import kotlinx.coroutines.Deferred
import retrofit2.Response

class LeyRepository(private val leyDao: ley_dao) {


    val allLeyes: LiveData<List<ley_entity>> = leyDao.getAllLeyes()


    fun retrieveLeyByApartado(ley: String): Deferred<Response<LiveData<List<ley_entity>>>> {
        return ApiService.getAnimalService().getleye(ley)
    }

    fun retrieveLeyes(): Deferred<Response<List<ley_entity>>> {
        return ApiService.getAnimalService().getleyes()
    }
}