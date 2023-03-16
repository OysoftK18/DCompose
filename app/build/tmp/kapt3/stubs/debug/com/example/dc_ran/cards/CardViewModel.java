package com.example.dc_ran.cards;

import androidx.lifecycle.ViewModel;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.example.dc_ran.repository.CardsRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import java.util.UUID;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/example/dc_ran/cards/CardViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/dc_ran/repository/CardsRepository;", "(Lcom/example/dc_ran/repository/CardsRepository;)V", "_cardList", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/example/dc_ran/cards/Card;", "cardList", "Lkotlinx/coroutines/flow/StateFlow;", "getCardList", "()Lkotlinx/coroutines/flow/StateFlow;", "setCardList", "(Lkotlinx/coroutines/flow/StateFlow;)V", "getRepository", "()Lcom/example/dc_ran/repository/CardsRepository;", "app_debug"})
public final class CardViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.dc_ran.repository.CardsRepository repository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.dc_ran.cards.Card>> _cardList = null;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.dc_ran.cards.Card>> cardList;
    
    @javax.inject.Inject()
    public CardViewModel(@org.jetbrains.annotations.NotNull()
    com.example.dc_ran.repository.CardsRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.dc_ran.repository.CardsRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.dc_ran.cards.Card>> getCardList() {
        return null;
    }
    
    public final void setCardList(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.example.dc_ran.cards.Card>> p0) {
    }
}