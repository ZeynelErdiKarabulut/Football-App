package com.zeynelerdi.footballapp.data.league

import com.zeynelerdi.footballapp.data.league.remote.response.DetailLeague
import io.reactivex.Observable

interface LeagueDataSource {
    fun getDetailLeague(id : String): Observable<List<DetailLeague>>
}