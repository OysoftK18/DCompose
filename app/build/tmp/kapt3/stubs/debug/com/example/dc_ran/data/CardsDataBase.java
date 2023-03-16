package com.example.dc_ran.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import com.example.dc_ran.cards.Card;
import com.example.dc_ran.utils.UUIDConverter;

@androidx.room.TypeConverters(value = {com.example.dc_ran.utils.UUIDConverter.class})
@androidx.room.Database(entities = {com.example.dc_ran.cards.Card.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/example/dc_ran/data/CardsDataBase;", "Landroidx/room/RoomDatabase;", "()V", "cardsDao", "Lcom/example/dc_ran/data/CardsDao;", "app_debug"})
public abstract class CardsDataBase extends androidx.room.RoomDatabase {
    
    public CardsDataBase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.dc_ran.data.CardsDao cardsDao();
}