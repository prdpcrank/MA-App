package com.example.maApp.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u0016H\u0002R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/example/maApp/viewmodel/NasaViewModel;", "Landroidx/lifecycle/ViewModel;", "getMaAppDataUseCase", "Lcom/example/maApp/domain/usecase/GetMaAppDataUseCase;", "getDetailsDataUseCase", "Lcom/example/maApp/domain/usecase/GetDetailsDataUseCase;", "(Lcom/example/maApp/domain/usecase/GetMaAppDataUseCase;Lcom/example/maApp/domain/usecase/GetDetailsDataUseCase;)V", "_nasaLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/maApp/domain/entity/HomePageItemEntity;", "_nasaLiveDetailsData", "Lcom/example/maApp/domain/entity/HomePageDetailsItemEntity;", "nasaLiveData", "Landroidx/lifecycle/LiveData;", "getNasaLiveData", "()Landroidx/lifecycle/LiveData;", "nasaLiveDetailsData", "getNasaLiveDetailsData", "pageCount", "", "getDetailsData", "", "id", "", "getNasaData", "app_debug"})
public final class NasaViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.maApp.domain.usecase.GetMaAppDataUseCase getMaAppDataUseCase = null;
    private final com.example.maApp.domain.usecase.GetDetailsDataUseCase getDetailsDataUseCase = null;
    private final java.lang.String pageCount = "20";
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.maApp.domain.entity.HomePageItemEntity>> _nasaLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.example.maApp.domain.entity.HomePageItemEntity>> nasaLiveData = null;
    private final androidx.lifecycle.MutableLiveData<com.example.maApp.domain.entity.HomePageDetailsItemEntity> _nasaLiveDetailsData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.example.maApp.domain.entity.HomePageDetailsItemEntity> nasaLiveDetailsData = null;
    
    @javax.inject.Inject
    public NasaViewModel(@org.jetbrains.annotations.NotNull
    com.example.maApp.domain.usecase.GetMaAppDataUseCase getMaAppDataUseCase, @org.jetbrains.annotations.NotNull
    com.example.maApp.domain.usecase.GetDetailsDataUseCase getDetailsDataUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.maApp.domain.entity.HomePageItemEntity>> getNasaLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.maApp.domain.entity.HomePageDetailsItemEntity> getNasaLiveDetailsData() {
        return null;
    }
    
    private final void getNasaData() {
    }
    
    public final void getDetailsData(int id) {
    }
}