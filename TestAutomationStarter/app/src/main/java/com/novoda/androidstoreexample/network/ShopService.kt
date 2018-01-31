package com.novoda.androidstoreexample.network

import com.novoda.androidstoreexample.models.CategoryResponse
import com.novoda.androidstoreexample.models.ProductResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ShopService {

    @GET("categories")
    fun getCategories(): Call<CategoryResponse>

    @GET("category/{categoryName}/items")
    fun getProductsFromCategory(@Path("categoryName") categoryName: String): Call<ProductResponse>

}