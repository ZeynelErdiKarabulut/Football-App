package com.zeynelerdi.footballapp.di

import com.zeynelerdi.footballapp.data.AppDatabase
import org.koin.dsl.module

val dbModule = module {

    single { AppDatabase.getAppDatabase(get()) }

}