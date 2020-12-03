package com.zeynelerdi.footballapp.data.league.remote

import com.zeynelerdi.footballapp.base.BaseResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface LeagueApiInterface {

    @GET("lookupleague.php")
    fun getDetailLeague(@Query("id") id : String): Observable<BaseResponse>

}