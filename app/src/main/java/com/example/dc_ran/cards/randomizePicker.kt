package com.example.dc_ran.cards

import java.util.*

val random = Random()

fun RandomizerPicker(cardList: List<Card> = getCards()): List<Card>{
    var cardsForPlayer = mutableListOf<Card>()
    var totalTierPoints = 0
    while (totalTierPoints < 6){
        var randomPick = random.nextInt(cardList.size)
        println("Random card picked is Number: #$randomPick")
        cardsForPlayer.add(cardList[randomPick])
        with(cardList[randomPick]){
            println("Name: $name")
            println("Tier: $tier")
        }
        totalTierPoints += cardList[randomPick].tier.toInt()
    }
    return cardsForPlayer
}