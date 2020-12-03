package com.zeynelerdi.footballapp.di

import com.zeynelerdi.footballapp.data.match.MatchDataSource
import com.zeynelerdi.footballapp.data.match.MatchRepository
import com.zeynelerdi.footballapp.data.match.remote.MatchApiInterface
import com.zeynelerdi.footballapp.ui.match.MatchViewModel
import com.zeynelerdi.footballapp.utils.Network
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.create

val matchModule = module {

    single<MatchApiInterface> { Network.builder().create() }

    single<MatchDataSource> { MatchRepository(get()) }

    viewModel { MatchViewModel(get()) }
}