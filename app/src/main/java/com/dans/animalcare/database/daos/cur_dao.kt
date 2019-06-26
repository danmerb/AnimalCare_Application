package com.dans.animalcare.database.daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.dans.animalcare.database.entities.curiosidad_entity


@Dao
interface cur_dao {
    @Query("SELECT * from curiosidad_table")
    fun getAllCuriosidades(): LiveData<List<curiosidad_entity>>


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(curiosidad: curiosidad_entity):Long

    @Query("delete from curiosidad_table")
    suspend fun deleteAll()

}