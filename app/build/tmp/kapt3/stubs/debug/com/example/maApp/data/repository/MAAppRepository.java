package com.example.maApp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0010B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ!\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/example/maApp/data/repository/MAAppRepository;", "Lcom/example/maApp/base/SafeApiCall;", "maAppDataService", "Lcom/example/maApp/data/service/MaAppDataService;", "(Lcom/example/maApp/data/service/MaAppDataService;)V", "getDetailsData", "Lcom/example/maApp/domain/entity/HomePageDetailsItemEntity;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMaAppData", "", "Lcom/example/maApp/domain/entity/HomePageItemEntity;", "pageCount", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LocalException", "app_debug"})
public final class MAAppRepository implements com.example.maApp.base.SafeApiCall {
    private final com.example.maApp.data.service.MaAppDataService maAppDataService = null;
    
    @javax.inject.Inject
    public MAAppRepository(@org.jetbrains.annotations.NotNull
    com.example.maApp.data.service.MaAppDataService maAppDataService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getDetailsData(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.maApp.domain.entity.HomePageDetailsItemEntity> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getMaAppData(@org.jetbrains.annotations.NotNull
    java.lang.String pageCount, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.maApp.domain.entity.HomePageItemEntity>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public <T extends java.lang.Object>java.lang.Object safeApiCall(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> apiCall, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.maApp.base.ApiResponse<? extends T>> p1) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\n\u000bB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u0082\u0001\u0002\f\r\u00a8\u0006\u000e"}, d2 = {"Lcom/example/maApp/data/repository/MAAppRepository$LocalException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "title", "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getTitle", "EmptySearch", "NoResults", "Lcom/example/maApp/data/repository/MAAppRepository$LocalException$EmptySearch;", "Lcom/example/maApp/data/repository/MAAppRepository$LocalException$NoResults;", "app_debug"})
    public static abstract class LocalException extends java.lang.Exception {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String title = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String description = null;
        
        private LocalException(java.lang.String title, java.lang.String description) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getDescription() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/maApp/data/repository/MAAppRepository$LocalException$EmptySearch;", "Lcom/example/maApp/data/repository/MAAppRepository$LocalException;", "()V", "app_debug"})
        public static final class EmptySearch extends com.example.maApp.data.repository.MAAppRepository.LocalException {
            @org.jetbrains.annotations.NotNull
            public static final com.example.maApp.data.repository.MAAppRepository.LocalException.EmptySearch INSTANCE = null;
            
            private EmptySearch() {
                super(null, null);
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/maApp/data/repository/MAAppRepository$LocalException$NoResults;", "Lcom/example/maApp/data/repository/MAAppRepository$LocalException;", "()V", "app_debug"})
        public static final class NoResults extends com.example.maApp.data.repository.MAAppRepository.LocalException {
            @org.jetbrains.annotations.NotNull
            public static final com.example.maApp.data.repository.MAAppRepository.LocalException.NoResults INSTANCE = null;
            
            private NoResults() {
                super(null, null);
            }
        }
    }
}