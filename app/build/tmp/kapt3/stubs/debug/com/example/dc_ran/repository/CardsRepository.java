package com.example.dc_ran.repository;

import com.example.dc_ran.cards.Card;
import com.example.dc_ran.data.CardsDao;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/dc_ran/repository/CardsRepository;", "", "cardsDao", "Lcom/example/dc_ran/data/CardsDao;", "(Lcom/example/dc_ran/data/CardsDao;)V", "getAllCards", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/dc_ran/cards/Card;", "app_debug"})
public final class CardsRepository {
    private final com.example.dc_ran.data.CardsDao cardsDao = null;
    
    @javax.inject.Inject()
    public CardsRepository(@org.jetbrains.annotations.NotNull()
    com.example.dc_ran.data.CardsDao cardsDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.dc_ran.cards.Card>> getAllCards() {
        return null;
    }
}