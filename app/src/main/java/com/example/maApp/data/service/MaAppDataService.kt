package com.example.maApp.data.service

import com.example.maApp.domain.entity.HomePageDetailsItemEntity
import com.example.maApp.domain.entity.HomePageEntity
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MaAppDataService {

    @GET("/api/users")
    suspend fun fetchAllData(@Query("per_page") fields: String): HomePageEntity

    @GET("/api/users/{id}")
    suspend fun getDetailsData(@Path("id") id: String): HomePageDetailsItemEntity

}