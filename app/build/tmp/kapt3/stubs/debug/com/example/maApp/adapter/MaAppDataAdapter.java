package com.example.maApp.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\u0014\u0010\u0018\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u001aR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u001c"}, d2 = {"Lcom/example/maApp/adapter/MaAppDataAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/maApp/adapter/MaAppDataAdapter$ViewHolder;", "actionPerformer", "Lcom/example/maApp/action/ActionPerformer;", "Lcom/example/maApp/action/MaAppAction;", "(Lcom/example/maApp/action/ActionPerformer;)V", "items", "", "Lcom/example/maApp/domain/entity/HomePageItemEntity;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "list", "", "ViewHolder", "app_debug"})
public final class MaAppDataAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.maApp.adapter.MaAppDataAdapter.ViewHolder> {
    private final com.example.maApp.action.ActionPerformer<com.example.maApp.action.MaAppAction> actionPerformer = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.maApp.domain.entity.HomePageItemEntity> items;
    
    public MaAppDataAdapter(@org.jetbrains.annotations.NotNull
    com.example.maApp.action.ActionPerformer<com.example.maApp.action.MaAppAction> actionPerformer) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.maApp.domain.entity.HomePageItemEntity> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.maApp.domain.entity.HomePageItemEntity> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.maApp.adapter.MaAppDataAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.maApp.adapter.MaAppDataAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.maApp.domain.entity.HomePageItemEntity> list) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/maApp/adapter/MaAppDataAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/maApp/databinding/GridImageLayoutBinding;", "(Lcom/example/maApp/databinding/GridImageLayoutBinding;)V", "getBinding", "()Lcom/example/maApp/databinding/GridImageLayoutBinding;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.example.maApp.databinding.GridImageLayoutBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        com.example.maApp.databinding.GridImageLayoutBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.maApp.databinding.GridImageLayoutBinding getBinding() {
            return null;
        }
    }
}