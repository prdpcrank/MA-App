package com.example.maApp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.maApp.domain.entity.HomePageDetailsItemEntity
import com.example.maApp.domain.entity.HomePageItemEntity
import com.example.maApp.domain.usecase.GetDetailsDataUseCase
import com.example.maApp.domain.usecase.GetMaAppDataUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NasaViewModel @Inject constructor(private val getMaAppDataUseCase: GetMaAppDataUseCase,
                                        private val getDetailsDataUseCase: GetDetailsDataUseCase) : ViewModel() {
   private val pageCount:String = "20"
    private val _nasaLiveData =
        MutableLiveData<List<HomePageItemEntity>?>()
    val nasaLiveData: LiveData<List<HomePageItemEntity>?> =
        _nasaLiveData

    private val _nasaLiveDetailsData =
        MutableLiveData<HomePageDetailsItemEntity?>()
    val nasaLiveDetailsData: LiveData<HomePageDetailsItemEntity?> =
        _nasaLiveDetailsData

    init {
        getNasaData()
    }

    private fun getNasaData() {
        viewModelScope.launch {
            _nasaLiveData.value = getMaAppDataUseCase.execute(pageCount)
        }
    }

    fun getDetailsData(id:Int) {
        viewModelScope.launch {
            _nasaLiveDetailsData.value = getDetailsDataUseCase.execute(id)

        }
    }

}