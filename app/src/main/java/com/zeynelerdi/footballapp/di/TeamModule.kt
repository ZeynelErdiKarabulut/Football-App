package com.zeynelerdi.footballapp.di

import com.zeynelerdi.footballapp.data.team.TeamDataSource
import com.zeynelerdi.footballapp.data.team.TeamRepository
import com.zeynelerdi.footballapp.data.team.remote.TeamApiInterface
import com.zeynelerdi.footballapp.ui.team.TeamViewModel
import com.zeynelerdi.footballapp.utils.Network
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.create

val teamModule = module {

    single<TeamApiInterface> { Network.builder().create() }

    single<TeamDataSource> { TeamRepository(get()) }

    viewModel { TeamViewModel(get()) }
}