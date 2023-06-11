package com.prashant830.swipeassign.network.sevices

import com.prashant830.swipeassign.Model.AddPRoducts
import com.prashant830.swipeassign.Model.product
import retrofit2.Response
import retrofit2.http.*

interface SendProductApi {


    @GET("get")
    suspend fun getProduct()
            : Response<product>

    @FormUrlEncoded
    @POST("add")
    suspend fun addProduct(@FieldMap metadata : Map<String,String>)
            : Response<AddPRoducts>


}