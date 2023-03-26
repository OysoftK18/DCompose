package com.example.dc_ran.cards

import java.util.*
import kotlin.collections.ArrayList

val random = Random()

fun cardsPerPlayer(mutableList: MutableList<HeroesItem>): List<HeroesItem>{
    var arrayHeroes = mutableListOf<HeroesItem>()
    var costPoints = 0
    var notEnough = true

    var cardNumber = mutableList.random()
    costPoints += cardNumber.tier.toInt()
    arrayHeroes.add(cardNumber)
    while (notEnough) {
        cardNumber = mutableList.random()
        if (cardNumber.tier.toInt() <= (6-costPoints)){
            arrayHeroes.add(cardNumber)
        }

        if (costPoints == 6){
            notEnough = false
        }

    }

    print(arrayHeroes)

    return arrayHeroes.toList()
}