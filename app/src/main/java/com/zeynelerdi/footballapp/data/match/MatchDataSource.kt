package com.zeynelerdi.footballapp.data.match

import com.zeynelerdi.footballapp.data.league.remote.response.DetailLeague
import com.zeynelerdi.footballapp.data.matchfavorite.local.response.MatchFavorite
import com.zeynelerdi.footballapp.data.match.remote.response.Match
import com.zeynelerdi.footballapp.data.team.remote.response.Team
import io.reactivex.Completable
import io.reactivex.Observable
import io.reactivex.Single

interface MatchDataSource {
    fun getMatchList(id : String): Observable<List<Match>>
    fun getDetailMatch(id : String): Observable<List<Match>>
    fun getDetailLeague(id : String): Observable<List<DetailLeague>>
    fun getTeamDetail(id : String): Observable<List<Team>>
    fun getSearchMatch(query : String): Observable<List<Match>>
}