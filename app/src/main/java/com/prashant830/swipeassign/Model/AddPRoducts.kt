package com.prashant830.swipeassign.Model

data class AddPRoducts(
    val message: String,
    val product_details: ProductDetails,
    val product_id: Int,
    val success: Boolean
)