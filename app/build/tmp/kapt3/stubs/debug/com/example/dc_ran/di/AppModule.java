package com.example.dc_ran.di;

import android.content.Context;
import androidx.room.Room;
import com.example.dc_ran.data.CardsDao;
import com.example.dc_ran.data.CardsDataBase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\n"}, d2 = {"Lcom/example/dc_ran/di/AppModule;", "", "()V", "provideAppDatabase", "Lcom/example/dc_ran/data/CardsDataBase;", "context", "Landroid/content/Context;", "provideCardsDao", "Lcom/example/dc_ran/data/CardsDao;", "cadsDatabase", "app_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.dc_ran.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.dc_ran.data.CardsDao provideCardsDao(@org.jetbrains.annotations.NotNull()
    com.example.dc_ran.data.CardsDataBase cadsDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.dc_ran.data.CardsDataBase provideAppDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
}