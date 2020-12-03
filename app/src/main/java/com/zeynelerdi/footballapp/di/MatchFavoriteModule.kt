package com.zeynelerdi.footballapp.di

import com.zeynelerdi.footballapp.data.AppDatabase
import com.zeynelerdi.footballapp.data.matchfavorite.MatchFavoriteDataSource
import com.zeynelerdi.footballapp.data.matchfavorite.MatchFavoriteRepository
import com.zeynelerdi.footballapp.ui.favorite.match.MatchFavoriteViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val matchFavoriteModule = module {

    single {
        val appDatabase: AppDatabase = get()
        return@single appDatabase.favoriteDao()
    }

    single<MatchFavoriteDataSource> { MatchFavoriteRepository(get()) }

    viewModel { MatchFavoriteViewModel(get()) }
}