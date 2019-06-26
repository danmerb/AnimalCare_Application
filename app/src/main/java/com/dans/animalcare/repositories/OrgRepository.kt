package com.dans.animalcare.repositories

import androidx.lifecycle.LiveData
import com.dans.animalcare.database.daos.org_dao
import com.dans.animalcare.database.entities.org_entity
import com.dans.animalcare.service.retrofit.ApiService
import kotlinx.coroutines.Deferred
import retrofit2.Response

class OrgRepository(private val OrgDao: org_dao) {


    val allOrgs: LiveData<List<org_entity>> = OrgDao.getAllOrgs()


    fun retrieveOrgByName(org: String): Deferred<Response<LiveData<List<org_entity>>>> {
        return ApiService.getAnimalService().getOrg(org)
    }

    fun retrieveOrgs(): Deferred<Response<List<org_entity>>> {
        return ApiService.getAnimalService().getOrgs()
    }
}