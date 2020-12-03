package com.zeynelerdi.footballapp.di

import com.zeynelerdi.footballapp.data.league.LeagueDataSource
import com.zeynelerdi.footballapp.data.league.LeagueRepository
import com.zeynelerdi.footballapp.data.league.remote.LeagueApiInterface
import com.zeynelerdi.footballapp.ui.league.LeagueViewModel
import com.zeynelerdi.footballapp.utils.Network
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.create

val leagueModule = module {

    single<LeagueApiInterface> { Network.builder().create() }

    single<LeagueDataSource> { LeagueRepository(get()) }

    viewModel { LeagueViewModel(get()) }
}