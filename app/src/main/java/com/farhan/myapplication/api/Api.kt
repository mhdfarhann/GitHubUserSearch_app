package com.farhan.myapplication.api

import com.farhan.myapplication.data.model.User
import com.farhan.myapplication.data.model.UserDetailResponse
import com.farhan.myapplication.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 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")

    fun getSearchUsers(
        @Query("q") query:String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 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")

    fun getDetailUsers(
        @Path("username") username : String
    ):Call<UserDetailResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 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")

    fun getFollowers(
        @Path("username") username : String
    ):Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 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")

    fun getFollowing(
        @Path("username") username : String
    ):Call<ArrayList<User>>
}