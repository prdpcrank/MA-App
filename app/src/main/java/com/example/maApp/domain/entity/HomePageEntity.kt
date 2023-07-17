package com.example.maApp.domain.entity

import androidx.annotation.Keep
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Keep
data class HomePageEntity(
    @SerializedName("page") val page : Int,
    @SerializedName("per_page") val perPage : Int,
    @SerializedName("total") val total : Int,
    @SerializedName("total_pages") val total_pages : Int,
    @SerializedName("data") val data : List<HomePageItemEntity>)
@Entity(tableName = "appTable")
@Keep
data class HomePageItemEntity(
    @PrimaryKey
    @SerializedName("id") val id : Int? =null,
    @SerializedName("email") val email : String? =null,
    @SerializedName("first_name") val firstName : String? =null,
    @SerializedName("last_name") val lastName : String? =null,
    @SerializedName("avatar") val avatar : String? =null)
@Keep
data class HomePageDetailsItemEntity(
    @SerializedName("data") val data : HomePageItemEntity,
    @SerializedName("support") val support : SupportEntity)

@Keep
data class SupportEntity(
    @SerializedName("url") val url : String,
    @SerializedName("text") val text : String)
