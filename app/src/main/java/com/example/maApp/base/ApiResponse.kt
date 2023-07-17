package com.example.maApp.base

import okhttp3.ResponseBody

sealed class ApiResponse<out T> {
    data class Success<T>(val value: T) : ApiResponse<T>()
    data class Failure(
        val isNetworkError: Boolean,
        val errorCode: Int?,
        val errorBody: ResponseBody?
    ) : ApiResponse<Nothing>()

    object Loading : ApiResponse<Nothing>()
}