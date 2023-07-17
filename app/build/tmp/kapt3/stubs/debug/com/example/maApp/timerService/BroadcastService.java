package com.example.maApp.timerService;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0016H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lcom/example/maApp/timerService/BroadcastService;", "Landroid/app/Service;", "()V", "bi", "Landroid/content/Intent;", "getBi", "()Landroid/content/Intent;", "setBi", "(Landroid/content/Intent;)V", "cdt", "Landroid/os/CountDownTimer;", "getCdt", "()Landroid/os/CountDownTimer;", "setCdt", "(Landroid/os/CountDownTimer;)V", "onBind", "Landroid/os/IBinder;", "arg0", "onCreate", "", "onDestroy", "onStartCommand", "", "intent", "flags", "startId", "Companion", "app_debug"})
public final class BroadcastService extends android.app.Service {
    @org.jetbrains.annotations.NotNull
    private android.content.Intent bi;
    @org.jetbrains.annotations.Nullable
    private android.os.CountDownTimer cdt;
    @org.jetbrains.annotations.NotNull
    public static final com.example.maApp.timerService.BroadcastService.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String COUNTDOWN_BR = "com.example.nasaapp.countdown_br";
    
    public BroadcastService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Intent getBi() {
        return null;
    }
    
    public final void setBi(@org.jetbrains.annotations.NotNull
    android.content.Intent p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.os.CountDownTimer getCdt() {
        return null;
    }
    
    public final void setCdt(@org.jetbrains.annotations.Nullable
    android.os.CountDownTimer p0) {
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
    
    @java.lang.Override
    public int onStartCommand(@org.jetbrains.annotations.NotNull
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.os.IBinder onBind(@org.jetbrains.annotations.NotNull
    android.content.Intent arg0) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/maApp/timerService/BroadcastService$Companion;", "", "()V", "COUNTDOWN_BR", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}