package com.example.maApp.domain.usecase

import com.example.maApp.data.repository.MAAppRepository
import com.example.maApp.domain.entity.HomePageItemEntity
import javax.inject.Inject

class GetMaAppDataUseCase @Inject constructor(private val repository: MAAppRepository) {
    suspend fun execute(pageCount:String): List<HomePageItemEntity>? {
        return repository.getMaAppData(pageCount)
    }
}