package id.khosem.githubuser.ngapp.api

import id.khosem.githubuser.ngapp.data.model.DetailUserResponse
import id.khosem.githubuser.ngapp.data.model.User
import id.khosem.githubuser.ngapp.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query
interface Api {
    @GET("search/users")
    @Headers("Authorization: token 09dd190f34ba4284018b42094beb29118375045b")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 09dd190f34ba4284018b42094beb29118375045b")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 09dd190f34ba4284018b42094beb29118375045b")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 09dd190f34ba4284018b42094beb29118375045b")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}