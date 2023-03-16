package com.example.dc_ran.widgets

//import androidx.compose.foundation.BorderStroke
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material3.*
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import coil.compose.AsyncImage
//import coil.request.ImageRequest
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//@Preview
//fun CustomPlayerView(playerNumber: Int = 0, cardList: List<Card> = getCards()) {
//    LazyColumn(content = {
//        items(playerNumber){
//            Card(
//                colors = CardDefaults.cardColors(Color.Gray),
//                elevation = CardDefaults.cardElevation(10.dp)
//            ) {
//                Text(text = "Player $playerNumber", style = MaterialTheme.typography.headlineLarge)
//                Row(modifier = Modifier.fillMaxWidth()) {
//                    for (card in cardList) {
//                        CustomCardView(card, modifier = Modifier.weight(1.0f))
//                    }
//                }
//            }
//        }
//    })
//}
//
//@Composable
//fun CustomCardView(card: Card = getCards()[0], modifier: Modifier) {
//    Surface(
//        modifier.padding(5.dp),
//        border = BorderStroke(6.dp, Color.White),
//        shape = RoundedCornerShape(10.dp)
//    ) {
//        Column(horizontalAlignment = Alignment.CenterHorizontally) {
//            AsyncImage(
//                model = ImageRequest.Builder(context = LocalContext.current).data(card.url)
//                    .crossfade(true).build(), contentDescription = "${card.name}",
//                modifier = Modifier.padding(5.dp)
//            )
//            Text(
//                text = "Tier: ${card.tier}", style = MaterialTheme.typography.headlineLarge,
//                modifier = Modifier.padding(10.dp)
//            )
//
//        }
//    }
//}