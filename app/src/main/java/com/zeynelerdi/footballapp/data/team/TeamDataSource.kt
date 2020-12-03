package com.zeynelerdi.footballapp.data.team

import com.zeynelerdi.footballapp.data.team.remote.response.Team
import io.reactivex.Observable

interface TeamDataSource {
    fun getTeamList(id : String): Observable<List<Team>>
    fun getTeamDetail(id : String): Observable<List<Team>>
    fun getSearchTeam(query : String): Observable<List<Team>>
}