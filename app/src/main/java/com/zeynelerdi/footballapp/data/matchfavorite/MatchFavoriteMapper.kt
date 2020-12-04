package com.zeynelerdi.footballapp.data.matchfavorite

import com.zeynelerdi.footballapp.data.match.remote.response.Match
import com.zeynelerdi.footballapp.data.matchfavorite.local.response.MatchFavorite

fun Match.toFavorite() : MatchFavorite {
    return MatchFavorite(
        IddEvent = idEvent?.toInt() ?: 0,
        nameLeague = nameLeague ?: "",
        homeTeam = homeTeam ?: "",
        awayTeam = awayTeam ?: "",
        homeScore = homeScore ?: "",
        awayScore = awayScore ?: "",
        dateEvent = dateEvent ?: "",
        IddLeague = idLeague ?: ""
    )
}

fun MatchFavorite.toMatch() : Match {
    return Match(
        idEvent = IddEvent.toString(),
        nameLeague = nameLeague,
        homeTeam = homeTeam,
        awayTeam = awayTeam,
        homeScore = homeScore,
        awayScore = awayScore,
        dateEvent = dateEvent,
        idLeague = IddLeague
    )
}