package com.zeynelerdi.footballapp.di

import com.zeynelerdi.footballapp.data.teamfavorite.TeamFavoriteDataSource
import com.zeynelerdi.footballapp.data.teamfavorite.TeamFavoriteRepository
import com.zeynelerdi.footballapp.ui.favorite.team.TeamFavoriteViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val teamFavoriteModule = module {

    single<TeamFavoriteDataSource> { TeamFavoriteRepository(get()) }

    viewModel { TeamFavoriteViewModel(get()) }
}