package com.example.maApp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0017\u0010 \u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002\u00a2\u0006\u0002\u0010#J\u0010\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u0003H\u0016J\b\u0010&\u001a\u00020\u001eH\u0002J\b\u0010\'\u001a\u00020\u001eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006("}, d2 = {"Lcom/example/maApp/HomeFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/example/maApp/action/ActionPerformer;", "Lcom/example/maApp/action/MaAppAction;", "()V", "adapter", "Lcom/example/maApp/adapter/MaAppDataAdapter;", "binding", "Lcom/example/maApp/databinding/FragmentHomeBinding;", "nasaViewModel", "Lcom/example/maApp/viewmodel/NasaViewModel;", "getNasaViewModel", "()Lcom/example/maApp/viewmodel/NasaViewModel;", "nasaViewModel$delegate", "Lkotlin/Lazy;", "repository", "Lcom/example/maApp/room/DbRepository;", "getRepository", "()Lcom/example/maApp/room/DbRepository;", "setRepository", "(Lcom/example/maApp/room/DbRepository;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "openDetailsFragment", "uuid", "", "(Ljava/lang/Integer;)V", "performAction", "action", "setRecyclerView", "setUpObserver", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class HomeFragment extends androidx.fragment.app.Fragment implements com.example.maApp.action.ActionPerformer<com.example.maApp.action.MaAppAction> {
    private com.example.maApp.databinding.FragmentHomeBinding binding;
    private com.example.maApp.adapter.MaAppDataAdapter adapter;
    @javax.inject.Inject
    public com.example.maApp.room.DbRepository repository;
    private final kotlin.Lazy nasaViewModel$delegate = null;
    
    public HomeFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.maApp.room.DbRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull
    com.example.maApp.room.DbRepository p0) {
    }
    
    private final com.example.maApp.viewmodel.NasaViewModel getNasaViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setRecyclerView() {
    }
    
    private final void setUpObserver() {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void performAction(@org.jetbrains.annotations.NotNull
    com.example.maApp.action.MaAppAction action) {
    }
    
    private final void openDetailsFragment(java.lang.Integer uuid) {
    }
}