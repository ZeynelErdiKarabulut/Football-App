package com.zeynelerdi.footballapp.di

import com.zeynelerdi.footballapp.data.standing.StandingDataSource
import com.zeynelerdi.footballapp.data.standing.StandingRepository
import com.zeynelerdi.footballapp.data.standing.remote.StandingApiInterface
import com.zeynelerdi.footballapp.ui.standing.StandingViewModel
import com.zeynelerdi.footballapp.utils.Network
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.create

val standingModule = module {

    single<StandingApiInterface> { Network.builder().create() }

    single<StandingDataSource> { StandingRepository(get()) }

    viewModel { StandingViewModel(get()) }
}