package com.example.musicappui.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SubscriptionView() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Text("Manage Subscription")
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            elevation = 5.dp,
            backgroundColor = Color.White,
            shape = RoundedCornerShape(8.dp)
        ){
           Column{
               Row(modifier = Modifier.fillMaxWidth(),
                   horizontalArrangement = Arrangement.SpaceBetween){
                   Column(modifier = Modifier.padding(8.dp)
                   ){
                       Text("Musical")
                       Text("Free tier")
                   }
                   Row(modifier = Modifier.padding(top = 16.dp, bottom = 16.dp),
                       //horizontalArrangement = Arrangement.Absolute.Left
                   ){
                       Text("See all plans",
                           color = Color.Blue)
                       Icon(
                           imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                           contentDescription = null,
                           tint = Color.Blue
                       )
                   }
               }
               Divider(modifier = Modifier.padding(horizontal = 8.dp))
               Row(modifier = Modifier.padding(8.dp),
                   verticalAlignment = Alignment.CenterVertically){
                   Icon(imageVector = Icons.Default.AccountBox, contentDescription = null)
                   Text("Get a plan", modifier = Modifier.padding(vertical = 8.dp))
               }
           }


        }
    }
}