package com.zeynelerdi.footballapp.data.standing

import com.zeynelerdi.footballapp.data.match.remote.response.Match
import com.zeynelerdi.footballapp.data.standing.remote.response.Standing
import io.reactivex.Observable

interface StandingDataSource {
    fun getStanding(id : String): Observable<List<Standing>>
}