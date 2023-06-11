package com.prashant830.swipeassign.Screens


import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.prashant830.swipeassign.Model.productItemX
import com.prashant830.swipeassign.R


@Composable
fun HomeScreen(response : List<productItemX>) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        ) {

        Spacer(modifier = Modifier.size(10.dp))
        verticalRecycle(response)
    }
}


@Composable
    fun verticalRecycle(response : List<productItemX>) {


        LazyColumn(
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
            modifier = Modifier.padding(bottom = 60.dp)

        ) {
            items(response) {
                    list -> ListItem(list)
            }
        }
    }




@Composable
fun ListItem(productItem: productItemX) {
     var context = LocalContext.current
    Card(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth(),
        elevation = 2.dp,
        backgroundColor = Color.White,
        shape = RoundedCornerShape(corner = CornerSize(16.dp))
    ) {
        Row {
            Image(
                painter = painterResource(id = R.drawable.person ),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(8.dp)
                    .size(84.dp)
                    .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
                    .align(Alignment.CenterVertically)
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)
            ) {
                Text(text = productItem.product_name, style = typography.h6)
                Text(text = productItem.product_type, style = typography.caption)
                Text(text = productItem.price.toString() , style = typography.caption)
                Text(text = productItem.tax.toString() , style = typography.caption)
            }
        }
    }
}


@Composable
fun SendProductScreen( mess : String , viewModels: AllViewModels) {
    var context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Spacer(modifier = Modifier.size(30.dp))

        var value by remember { mutableStateOf("") }

        OutlinedTextField(
            placeholder = { Text(text = "Enter Product Name") },
            onValueChange = { it ->
                value = it
            },
            value = value,
            label = { Text("product name") },
            // leadingIcon = { Icon(imageVector = Icons.Filled.Person, contentDescription = "searchIcon")}
        )

        Spacer(modifier = Modifier.size(10.dp))
        var valueTwo by remember { mutableStateOf("") }

        OutlinedTextField(
            placeholder = { Text(text = "Enter Product Type") },
            onValueChange = { it ->
                valueTwo = it
            },
            value = valueTwo,
            label = { Text("product type") },
            // leadingIcon = { Icon(imageVector = Icons.Filled.Person, contentDescription = "searchIcon")}
        )
        Spacer(modifier = Modifier.size(10.dp))

        var valueThree by remember { mutableStateOf("") }

        OutlinedTextField(
            placeholder = { Text(text = "Enter Product Price") },
            onValueChange = { it ->
                valueThree = it
            },
            value = valueThree,
            label = { Text("price") },
            // leadingIcon = { Icon(imageVector = Icons.Filled.Person, contentDescription = "searchIcon")}
        )
        Spacer(modifier = Modifier.size(10.dp))

        var valueFour by remember { mutableStateOf("") }

        OutlinedTextField(
            placeholder = { Text(text = "Enter Product Tax") },
            onValueChange = { it ->
                valueFour = it
            },
            value = valueFour,
            label = { Text("tax") },
            // leadingIcon = { Icon(imageVector = Icons.Filled.Person, contentDescription = "searchIcon")}
        )
        Spacer(modifier = Modifier.size(30.dp))

        var context = LocalContext.current
        Button(onClick = {

                if(value == ""){
                    Toast.makeText(context, "Please enter product name", Toast.LENGTH_SHORT).show()
                    Log.d("ggg", "hgyugygyu ")
                }
                else if(valueTwo == ""){
                Toast.makeText(context, "Please enter product type", Toast.LENGTH_SHORT).show()
               }
               else if(valueThree == ""){
                 Toast.makeText(context, "Please enter price", Toast.LENGTH_SHORT).show()
               }
               else if(valueFour == ""){
                 Toast.makeText(context, "Please enter Tax", Toast.LENGTH_SHORT).show()
               }

            else {
                   var map: Map<String, String> = mutableMapOf(
                       "product_name" to value,
                       "product_type" to valueTwo, "price" to valueFour,
                       "tax" to valueFour
                   )

                   viewModels.addProductResponse(map)

                   Toast.makeText(context, mess, Toast.LENGTH_SHORT).show()
               }
        },
            Modifier
                .width(150.dp)
                .height(45.dp),
            border = BorderStroke(1.dp, Color.Gray),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
            shape = RoundedCornerShape(50)
        ) {
            Text(text = "send Product")
        }
        }
    }





    @Composable
    fun mText( text : String) {
         Text(text = text ,  modifier = Modifier
             .height(30.dp)
             .padding(20.dp), style = typography.caption)
    }
    @Composable
     fun nText( text : String) {
    Text(text = text )
   }





//@Composable
//fun loginScreen(food:List<recycler>) {
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//    ) {
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .verticalScroll(rememberScrollState()),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        ) {
//
//        Spacer(modifier = Modifier.size(30.dp))
//        editText(placeholder = "Enter Your Name", label = "name")
//        Spacer(modifier = Modifier.size(5.dp))
//        editText(placeholder = "Enter Your Password", label = "Password")
//        Spacer(modifier = Modifier.size(30.dp))
//        button(name = "SignIn")
//        Spacer(modifier = Modifier.size(30.dp))
//        verticalRecycle(food)
//        Spacer(modifier = Modifier.size(30.dp))
//        editText(placeholder = "Enter Your Name", label = "name")
//        Spacer(modifier = Modifier.size(5.dp))
//        editText(placeholder = "Enter Your Password", label = "Password")
//        Spacer(modifier = Modifier.size(30.dp))
//        button(name = "SignIn")
//        Spacer(modifier = Modifier.size(30.dp))
//        horizentalRecycle(food)
//        Spacer(modifier = Modifier.size(30.dp))
//
//
//    }
//    }
//}
//
//    @Composable
//    fun editText(placeholder: String, label: String) {
//        var value by remember { mutableStateOf("") }
//
//        OutlinedTextField(
//            placeholder = { Text(text = placeholder) },
//            onValueChange = { it ->
//                value = it
//            },
//            value = value,
//            label = { Text(label) },
//            // leadingIcon = { Icon(imageVector = Icons.Filled.Person, contentDescription = "searchIcon")}
//        )
//
//
//    }
//
//    @Composable
//    fun button(name: String) {
//        var context = LocalContext.current
//        Button(onClick = { makeToast(context , "login Clicked successfully !!") },
//            Modifier
//                .width(150.dp)
//                .height(45.dp),
//            border = BorderStroke(1.dp, Color.Gray),
//            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
//            shape = RoundedCornerShape(50)
//        ) {
//            Text(text = name)
//        }
//    }
//
//

//@Preview(showBackground = true)
//@Composable
//fun defaultPreview(){
//    loginScreen(allfooditems.recyclerList())
//}
