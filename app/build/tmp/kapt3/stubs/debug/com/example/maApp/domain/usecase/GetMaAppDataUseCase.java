package com.example.maApp.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J!\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/example/maApp/domain/usecase/GetMaAppDataUseCase;", "", "repository", "Lcom/example/maApp/data/repository/MAAppRepository;", "(Lcom/example/maApp/data/repository/MAAppRepository;)V", "execute", "", "Lcom/example/maApp/domain/entity/HomePageItemEntity;", "pageCount", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GetMaAppDataUseCase {
    private final com.example.maApp.data.repository.MAAppRepository repository = null;
    
    @javax.inject.Inject
    public GetMaAppDataUseCase(@org.jetbrains.annotations.NotNull
    com.example.maApp.data.repository.MAAppRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object execute(@org.jetbrains.annotations.NotNull
    java.lang.String pageCount, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.maApp.domain.entity.HomePageItemEntity>> continuation) {
        return null;
    }
}