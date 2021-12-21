package com.example.loginregistration.api

import com.example.loginregistration.models.DefaultResponse
import com.example.loginregistration.models.LoginResponse
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST
import retrofit2.Call
import retrofit2.http.Field

interface Api {

    @FormUrlEncoded
    @POST("createuser")
    fun createUser(
        @Field("email") email: String,
        @Field("name") name:String,
        @Field("password") password:String,
        @Field("school") school:String
    ):Call<DefaultResponse>

    @FormUrlEncoded
    @POST("userlogin")

    fun userlogin(
        @Field("email") email: String,
        @Field("password") password: String
    ):Call<LoginResponse>
}