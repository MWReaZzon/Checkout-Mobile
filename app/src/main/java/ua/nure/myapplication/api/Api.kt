package ua.nure.myapplication.api

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import ua.nure.myapplication.api.models.UserWorks
import ua.nure.myapplication.api.requests.LoginRequest
import ua.nure.myapplication.api.requests.RegisterRequest
import ua.nure.myapplication.api.responses.DetailResponse
import ua.nure.myapplication.api.responses.LoginResponse

const val authBase = "/api"
const val itemsBase = "/items"

interface Api {
    @POST("$authBase/login/")
    fun login(@Body request:LoginRequest) : Call<LoginResponse>

    @POST("$authBase/registration/")
    fun register(@Body request:RegisterRequest) : Call<DetailResponse>

    @GET("$authBase/user/works")
    fun getUserWorks() : Call<UserWorks>

    //@POST("$authBase/logout/")
    //fun logout() : Call<DetailResponse?>

    //@GET("$itemsBase/{id}/")
    //fun getItem(@Path("id") id:Int) : Call<Item>
}