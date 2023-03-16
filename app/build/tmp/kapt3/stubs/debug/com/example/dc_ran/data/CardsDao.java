package com.example.dc_ran.data;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import com.example.dc_ran.cards.Card;
import kotlinx.coroutines.flow.Flow;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/example/dc_ran/data/CardsDao;", "", "getAllCards", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/dc_ran/cards/Card;", "app_debug"})
public abstract interface CardsDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Table_Cards")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.dc_ran.cards.Card>> getAllCards();
}