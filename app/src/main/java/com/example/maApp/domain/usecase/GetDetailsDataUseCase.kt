package com.example.maApp.domain.usecase

import com.example.maApp.data.repository.MAAppRepository
import com.example.maApp.domain.entity.HomePageDetailsItemEntity
import javax.inject.Inject

class GetDetailsDataUseCase @Inject constructor(private val repository: MAAppRepository) {
    suspend fun execute(id:Int): HomePageDetailsItemEntity? {
        return repository.getDetailsData(id)
    }
}