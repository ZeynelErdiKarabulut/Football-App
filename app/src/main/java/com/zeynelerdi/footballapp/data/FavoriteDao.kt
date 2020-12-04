package com.zeynelerdi.footballapp.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.zeynelerdi.footballapp.data.matchfavorite.local.response.MatchFavorite
import com.zeynelerdi.footballapp.data.teamfavorite.local.response.TeamFavorite
import io.reactivex.Single

@Dao
abstract class FavoriteDao {
    @Query("SELECT * FROM match_favorite WHERE IddEvent = :intId")
    abstract fun getFavoriteMatchById(intId: Int?): Single<List<MatchFavorite>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun addFavoriteMatch(favorite: MatchFavorite)

    @Query("SELECT * FROM match_favorite")
    abstract fun getListFavoriteMatch(): Single<List<MatchFavorite>>

    @Query("DELETE FROM match_favorite WHERE IddEvent = :intId")
    abstract fun deleteFavoriteMatch(intId: Int?)

    @Query("SELECT * FROM team_favorite WHERE IddTeam = :intId")
    abstract fun getFavoriteTeamById(intId: Int?): Single<List<TeamFavorite>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun addFavoriteTeam(favorite: TeamFavorite)

    @Query("SELECT * FROM team_favorite")
    abstract fun getListFavoriteTeam(): Single<List<TeamFavorite>>

    @Query("DELETE FROM team_favorite WHERE IddTeam = :intId")
    abstract fun deleteFavoriteTeam(intId: Int?)

}