package com.example.dc_ran.cards

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(tableName = "Table_Cards")
data class Card(
    @PrimaryKey
    val uuid: UUID = UUID.randomUUID(),
    @ColumnInfo("name")
    val name: String,
    @ColumnInfo("tier")
    val tier: String,
    @ColumnInfo("url")
    val url: String
)

fun getCards(): List<Card> {
    return listOf(
        Card(
            name = "Alan Scott",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/ame:Alan%20Scott%20MC.jpg"
        ),
        Card(
            name = "Animal Man",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/Animal%20Man%20MC.jpg"
        ),
        Card(
            name = "Aquaman",
            tier = "4",
            url = "https://www.dcdeckbuilding.com/scans/Aquaman%20MC%209%20Confrontations.jpg"
        ),
        Card(
            name = "Aquaman",
            tier = "4",
            url = "https://www.dcdeckbuilding.com/scans/Aquaman%20MC.jpg"
        ),
        Card(
            name = "Aquaman",
            tier = "1",
            url = "https://www.dcdeckbuilding.com/scans/Aquaman%20MC%20Rebirth.jpg"
        ),
        Card(
            name = "Aquaman",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/DNM%20MC%20Aquaman.jpg"
        ),
        Card(
            name = "Aquaman",
            tier = "5",
            url = "https://www.dcdeckbuilding.com/scans/Aquaman%20MC%2015%20Confrontations.jpg"
        ),
        Card(
            name = "Arsenal",
            tier = "4",
            url = "https://www.dcdeckbuilding.com/scans/Arsenal%20MC%20Crisis%204.jpg"
        ),
        Card(name = "Bane", tier = "3", url = "https://www.dcdeckbuilding.com/scans/Bane%20MC.jpg"),
        Card(
            name = "Bane [Crisis]",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Bane%20Crisis%20MC.jpg"
        ),
        Card(
            name = "Batgirl",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Batgirl%20MC.jpg"
        ),
        Card(
            name = "Batgirl [Crisis]",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Batgirl%20Crisis%20MC.jpg"
        ),
        Card(
            name = "Batman",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/Batman%2012%20MC.jpg"
        ),
        Card(
            name = "Batman",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/Batman%20MC%20Rebirth.jpg"
        ),
        Card(
            name = "Batman",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Batman%209%20MC.jpg"
        ),
        Card(
            name = "Batman",
            tier = "1",
            url = "https://www.dcdeckbuilding.com/scans/Batman%20CO8.jpg"
        ),
        Card(
            name = "Batman",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/Batman%20MC.jpg"
        ),
        Card(
            name = "Batwoman",
            tier = "1",
            url = "https://www.dcdeckbuilding.com/scans/Batwoman%20MC.jpg"
        ),
        Card(
            name = "Beast Boy",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Beast%20Boy%20MC.jpg"
        ),
        Card(
            name = "Beast Boy",
            tier = "4",
            url = "https://www.dcdeckbuilding.com/scans/Beast%20Boy%20MC%20TTG.jpg"
        ),
        Card(
            name = "Big Barda",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Big%20Barda%20NG%20MC.jpg"
        ),
        Card(
            name = "Black Adam",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/Black%20Adam%20MC.jpg"
        ),
        Card(
            name = "Black Canary",
            tier = "1",
            url = "https://www.dcdeckbuilding.com/scans/Black%20Canary%20BOP%20MC.jpg"
        ),
        Card(
            name = "Black Canary",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/Black%20Canary%20HU%20MC.jpg"
        ),
        Card(
            name = "Black Lightning",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/Black%20Lightning%20MC.jpg"
        ),
        Card(
            name = "Black Manta",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Black%20Manta%20MC.jpg"
        ),
        Card(
            name = "Blue Beetle",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Blue%20Beetle%20MC.jpg"
        ),
        Card(
            name = "Booster Gold",
            tier = "4",
            url = "https://www.dcdeckbuilding.com/scans/Booster%20Gold%20MC.jpg"
        ),
        Card(
            name = "Brainiac 5",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Brainiac%205%20MC.jpg"
        ),
        Card(
            name = "Captain Boomerang",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/Captain%20Boomerang%20MC.jpg"
        ),
        Card(
            name = "Catwoman",
            tier = "1",
            url = "https://www.dcdeckbuilding.com/scans/Catwoman%20MC.jpg"
        ),
        Card(
            name = "Catwoman",
            tier = "4",
            url = "https://www.dcdeckbuilding.com/scans/Catwoman%20CO8.jpg"
        ),
        Card(
            name = "Chameleon Boy",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Chameleon%20Boy%20MC.jpg"
        ),
        Card(
            name = "Cheetah",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/Cheetah%20MC.jpg"
        ),
        Card(
            name = "Circe",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Circe%20MC%209%20Confrontations.jpg"
        ),
        Card(
            name = "Constantine",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Constantine%20MC.jpg"
        ),
        Card(
            name = "Cosmic Boy",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Cosmic%20Boy%20MC.jpg"
        ),
        Card(
            name = "Cyborg",
            tier = "4",
            url = "https://www.dcdeckbuilding.com/scans/Cyborg%20MC.jpg"
        ),
        Card(
            name = "Cyborg",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Cyborg%20MC%20TTG.jpg"
        ),
        Card(
            name = "Cyborg",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/cyborgErrata.jpg"
        ),
        Card(
            name = "Darkseid",
            tier = "5",
            url = "https://www.dcdeckbuilding.com/scans/Darkseid%20NG%20MC.jpg"
        ),
        Card(
            name = "Deathstroke",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Deathstroke%20MC.jpg"
        ),
        Card(
            name = "Deathstroke",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Promo%20MC%20Deathstroke.jpg"
        ),
        Card(
            name = "Doctor Fate",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/DNM%20MC%20Doctor%20Fate.jpg"
        ),
        Card(
            name = "Donna Troy",
            tier = "4",
            url = "https://www.dcdeckbuilding.com/scans/Donna%20Troy%20MC%20Crisis%204.jpg"
        ),
        Card(
            name = "Dr. Manhattan",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/Dr%20Manhattan%20MC.jpg"
        ),
        Card(
            name = "Felix Faust",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/Felix%20Faust%20MC%209%20%20Confrontations.jpg"
        ),
        Card(
            name = "Golden Glider",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/goldenGliderErrata.jpg"
        ),
        Card(
            name = "Gorilla Grodd",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Gorilla%20Grodd%20Promo.jpg"
        ),
        Card(
            name = "Granny Goodness",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/Granny%20Goodness%20NG%20MC.jpg"
        ),
        Card(
            name = "Green Arrow",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/greenArrowErrata.jpg"
        ),
        Card(
            name = "Green Lantern",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/Green%20Lantern%20MC.jpg"
        ),
        Card(
            name = "Green Lantern",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/R02%20Green%20Lantern%20Character%2015.jpg"
        ),
        Card(
            name = "Hal Jordan",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/DNM%20MC%20Hal%20Jordan.jpg"
        ),
        Card(
            name = "Harley Quinn",
            tier = "4",
            url = "https://www.dcdeckbuilding.com/scans/Harley%20Quinn%20MC.jpg"
        ),
        Card(
            name = "Hawkman",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/Hawkman%20MC.jpg"
        ),
        Card(
            name = "Huntress",
            tier = "1",
            url = "https://www.dcdeckbuilding.com/scans/Huntress%20MC.jpg"
        ),
        Card(
            name = "Indigo-1",
            tier = "4",
            url = "https://www.dcdeckbuilding.com/scans/Indigo%201%20MC.jpg"
        ),
        Card(
            name = "Jay Garrick",
            tier = "1",
            url = "https://www.dcdeckbuilding.com/scans/Jay%20Garrick%20MC.jpg"
        ),
        Card(
            name = "John Diggle",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/John%20Diggle%20MC.jpg"
        ),
        Card(
            name = "Kalibak",
            tier = "4",
            url = "https://www.dcdeckbuilding.com/scans/Kalibak%20NG%20MC.jpg"
        ),
        Card(
            name = "Katana",
            tier = "1",
            url = "https://www.dcdeckbuilding.com/scans/Katana%20MC.jpg"
        ),
        Card(
            name = "Kendra Saunders",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/DNM%20MC%20Kendra%20Saunders.jpg"
        ),
        Card(
            name = "Kid Flash",
            tier = "1",
            url = "https://www.dcdeckbuilding.com/scans/Kid%20Flash%20MC%20TTG.jpg"
        ),
        Card(
            name = "Kid Flash",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Kid%20Flash%20MC.jpg"
        ),
        Card(
            name = "Killer Frost",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/Killer%20Frost%20MC.jpg"
        ),
        Card(
            name = "Kyle Rayner",
            tier = "1",
            url = "https://www.dcdeckbuilding.com/scans/Kyle%20Rayner%20MC.jpg"
        ),
        Card(
            name = "Lex Luthor",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/Lex%20Luthor%20MC.jpg"
        ),
        Card(
            name = "Lightning Lad",
            tier = "1",
            url = "https://www.dcdeckbuilding.com/scans/Lightning%20Lad%20MC.jpg"
        ),
        Card(
            name = "Martian Manhunter",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/Martian%20Manhunter%20MC.jpg"
        ),
        Card(
            name = "Mirror Master",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/mirrorMasterErrata.jpg"
        ),
        Card(
            name = "Mister Terrific",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Mister%20Terrific%20MC.jpg"
        ),
        Card(
            name = "Mister Terrific",
            tier = "5",
            url = "https://www.dcdeckbuilding.com/scans/DNM%20MC%20Mister%20Terrific.jpg"
        ),
        Card(
            name = "Nightwing",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Nightwing%20MC%20Crisis%204.jpg"
        ),
        Card(
            name = "Nightwing",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/Nightwing%20MC.jpg"
        ),
        Card(
            name = "Nite Owl",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Nite%20Owl%20MC.jpg"
        ),
        Card(
            name = "Ocean Master",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/Ocean%20Master%20MC%209%20Confrontations.jpg"
        ),
        Card(
            name = "Oliver Queen",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/Oliver%20Queen%20MC.jpg"
        ),
        Card(
            name = "Omen",
            tier = "1",
            url = "https://www.dcdeckbuilding.com/scans/Omen%20MC%20Crisis%204.jpg"
        ),
        Card(
            name = "Oracle",
            tier = "1",
            url = "https://www.dcdeckbuilding.com/scans/Oracle%20MC.jpg"
        ),
        Card(
            name = "Orion",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Orion%20NG%20MC.jpg"
        ),
        Card(
            name = "Ozymandias",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Ozymandias%20MC.jpg"
        ),
        Card(
            name = "Poison Ivy",
            tier = "1",
            url = "https://www.dcdeckbuilding.com/scans/Poison%20Ivy%20MC.jpg"
        ),
        Card(
            name = "Power Girl",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/Power%20Girl%20MC.jpg"
        ),
        Card(
            name = "Raven",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Raven%20MC.jpg"
        ),
        Card(
            name = "Raven",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Raven%20MC%20TTG.jpg"
        ),
        Card(
            name = "Red Hood",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Red%20Hood%20CO8.jpg"
        ),
        Card(
            name = "Red Robin",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Red%20Robin%20MC.jpg"
        ),
        Card(
            name = "Red Robin",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Red%20Robin%20CO8.jpg"
        ),
        Card(
            name = "Red Tornado",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Red%20Tornado%20MC.jpg"
        ),
        Card(
            name = "Red Tornado [Crisis]",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Red%20Tornado%20Crisis%20MC.jpg"
        ),
        Card(
            name = "Robin",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Robin%20CO8.jpg"
        ),
        Card(
            name = "Robin",
            tier = "1",
            url = "https://www.dcdeckbuilding.com/scans/Robin%20MC.jpg"
        ),
        Card(
            name = "Robin",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Robin%20MC%20TTG.jpg"
        ),
        Card(
            name = "Saint Walker",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/Saint%20Walker%20MC.jpg"
        ),
        Card(
            name = "Sara Lance",
            tier = "1",
            url = "https://www.dcdeckbuilding.com/scans/Sara%20Lance%20MC.jpg"
        ),
        Card(
            name = "Saturn Girl",
            tier = "1",
            url = "https://www.dcdeckbuilding.com/scans/Saturn%20Girl%20MC.jpg"
        ),
        Card(
            name = "Silk Spectre",
            tier = "1",
            url = "https://www.dcdeckbuilding.com/scans/Silk%20Spectre%20MC.jpg"
        ),
        Card(
            name = "Simon Baz",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/simonBazErrata.jpg"
        ),
        Card(
            name = "Sinestro",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/Sinestro%20MC.jpg"
        ),
        Card(
            name = "Sinestro",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/R02%20Sinestro%20Character%2012.jpg"
        ),
        Card(
            name = "Skitter",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Skitter%20MC.jpg"
        ),
        Card(
            name = "Star Sapphire",
            tier = "1",
            url = "https://www.dcdeckbuilding.com/scans/Star%20Sapphire%20MC.jpg"
        ),
        Card(
            name = "Starfire",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Starfire%20TT%20MC.jpg"
        ),
        Card(
            name = "Starfire",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Starfire%20MC%20TTG.jpg"
        ),
        Card(
            name = "Starfire [Crisis]",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Starfire%20Crisis%20MC.jpg"
        ),
        Card(
            name = "Starfire [Crisis]",
            tier = "1",
            url = "https://www.dcdeckbuilding.com/scans/Crisis%20Starfire%20MC%20Crisis%204.jpg"
        ),
        Card(
            name = "Stargirl",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/Stargirl%20MC.jpg"
        ),
        Card(
            name = "Superboy",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/Superboy%20MC.jpg"
        ),
        Card(
            name = "Superman",
            tier = "4",
            url = "https://www.dcdeckbuilding.com/scans/Superman%20MC.jpg"
        ),
        Card(
            name = "Superman",
            tier = "1",
            url = "https://www.dcdeckbuilding.com/scans/Superman%20MC%2012%20Confrontations.jpg"
        ),
        Card(
            name = "Superman",
            tier = "1",
            url = "https://www.dcdeckbuilding.com/scans/supermanMCErrata.jpg"
        ),
        Card(
            name = "Tempest",
            tier = "1",
            url = "https://www.dcdeckbuilding.com/scans/Tempest%20MC%20Crisis%204.jpg"
        ),
        Card(
            name = "The Comedian",
            tier = "4",
            url = "https://www.dcdeckbuilding.com/scans/The%20Comedian%20MC.jpg"
        ),
        Card(
            name = "The Flash",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/DNM%20MC%20The%20Flash.jpg"
        ),
        Card(
            name = "The Joker",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/The%20Joker%209%20MC.jpg"
        ),
        Card(
            name = "Trickster",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/tricksterErrata.jpg"
        ),
        Card(
            name = "Vixen",
            tier = "4",
            url = "https://www.dcdeckbuilding.com/scans/Vixen%20MC.jpg"
        ),
        Card(
            name = "Weather Wizard",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/weatherWizardErrata.jpg"
        ),
        Card(
            name = "Wildcat",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/Wildcat%20MC.jpg"
        ),
        Card(
            name = "Wonder Girl",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Wonder%20Girl%20MC.jpg"
        ),
        Card(
            name = "Wonder Woman",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/wonderWoman12Errata.jpg"
        ),
        Card(
            name = "Wonder Woman",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/DNM%20MC%20Wonder%20Woman.jpg"
        ),
        Card(
            name = "Wonder Woman",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/Wonder%20Woman%20MC.jpg"
        ),
        Card(
            name = "Wonder Woman",
            tier = "4",
            url = "https://www.dcdeckbuilding.com/scans/Wonder%20Woman%20MC%2015%20Confrontations.jpg"
        ),
        Card(
            name = "Wonder Woman",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Wonder%20Woman%20MC%209%20Confrontations.jpg"
        ),
        Card(
            name = "Wonder Woman [Crisis]",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Wonder%20Woman%20Crisis%20MC.jpg"
        ),
        Card(
            name = "Zatanna Zatara",
            tier = "1",
            url = "https://www.dcdeckbuilding.com/scans/Zatanna%20Zatara%20MC.jpg"
        ),
        Card(
            name = "Zatanna Zatara",
            tier = "2",
            url = "https://www.dcdeckbuilding.com/scans/Zatanna%20Zatara%20MC%209%20Confrontations.jpg"
        ),
        Card(
            name = "Zatanna Zatara",
            tier = "1",
            url = "https://www.dcdeckbuilding.com/scans/Zatanna%20Zatara%20MC%2015%20Confrontations.jpg"
        ),
        Card(
            name = "Zatanna Zatara",
            tier = "3",
            url = "https://www.dcdeckbuilding.com/scans/Zatanna%20Zatara%20MC%2012%20Confrontations.jpg"
        )
    )
}