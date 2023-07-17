package com.example.maApp.data.repository

import com.example.maApp.base.ApiResponse
import com.example.maApp.base.SafeApiCall
import com.example.maApp.data.service.MaAppDataService
import com.example.maApp.domain.entity.HomePageDetailsItemEntity
import com.example.maApp.domain.entity.HomePageItemEntity
import javax.inject.Inject

class MAAppRepository @Inject constructor(private val maAppDataService: MaAppDataService) :
    SafeApiCall {

    sealed class LocalException(
        val title: String,
        val description: String = ""
    ) : Exception() {
        object EmptySearch : LocalException(
            title = ""
        )

        object NoResults : LocalException(
            title = "Whoops!",
            description = ""
        )
    }

    suspend fun getDetailsData(id: Int): HomePageDetailsItemEntity? {
        val response = safeApiCall {
            maAppDataService.getDetailsData(id.toString())
        }

        var emptyList: HomePageDetailsItemEntity? = null

        if (response is ApiResponse.Success) {
            return response.value
        }

        if (response is ApiResponse.Failure) {
            val v = response.errorBody
            try {
                if (response.errorCode == 404) {
                    val exception = LocalException.NoResults
                    throw (exception)
                }
            } catch (e: java.lang.Exception) {
            }
        }

        return emptyList
    }

    suspend fun getMaAppData(pageCount:String): List<HomePageItemEntity>? {
        val response = safeApiCall {
            maAppDataService.fetchAllData(pageCount)
        }

        var emptyList: List<HomePageItemEntity>? = null

        if (response is ApiResponse.Success) {
            return response.value.data
        }

        if (response is ApiResponse.Failure) {
            val v = response.errorBody
            try {
                if (response.errorCode == 404) {
                    val exception = LocalException.NoResults
                    throw (exception)
                }
            } catch (e: java.lang.Exception) {
            }
        }

        return emptyList
    }


}