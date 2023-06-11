package com.prashant830.swipeassign.Screens

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.prashant830.swipeassign.Model.productItemX
import com.prashant830.swipeassign.network.ApiManagement
import kotlinx.coroutines.launch

class AllViewModels : ViewModel() {


    var respose: List<productItemX> by mutableStateOf(listOf())
    var resposeTwo : String by mutableStateOf("")


    fun getProductResponse(){
        viewModelScope.launch {
              val response = ApiManagement.sendProductApi?.getProduct()
            Log.d("respose", response?.body().toString())
            if(response?.isSuccessful == true){
                respose = response.body()!!
            }
        }
    }

    fun addProductResponse(map: Map<String,String>){
        viewModelScope.launch {
            val response = ApiManagement.sendProductApi?.addProduct(map)
            Log.d("respose", response?.body().toString())
            if(response?.isSuccessful == true){
                resposeTwo = response.body()!!.message + response.body()!!.product_details.toString()
            }
        }
      }

    }
