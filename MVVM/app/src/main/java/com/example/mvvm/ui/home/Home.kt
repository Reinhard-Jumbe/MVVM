package com.example.mvvm.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.mvvm.navigation.ROUTE_HOTEL
import com.example.mvvm.navigation.ROUTE_INSERT
import com.example.mvvm.navigation.ROUTE_VIEWPRODUCTS

@Composable
fun Home(navController: NavController){

    Column {



        Text(text = "Home screen")

        AsyncImage(
            model = "https://www.emobilis.ac.ke/images/sliders/slide_7.jpg",
            contentDescription = null,
        )







        Button(onClick = {navController.navigate(ROUTE_INSERT) }) {

            Text("INSERT")

        }

        Text(text = "view screen")

        Button(onClick = { navController.navigate(ROUTE_VIEWPRODUCTS) }) {

            Text(text = "view")

        }




        Text(text = "Hotel")

        Button(onClick = { navController.navigate(ROUTE_HOTEL) }) {

            Text(text = "Hotel")

        }




    }










}