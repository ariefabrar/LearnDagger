package com.muhammadabrararief.learndagger

import dagger.Binds
import dagger.Module

@Module
abstract class DieselEngineModule {

    @Binds
    abstract fun provideEngine(dieselEngine: DieselEngine): Engine

}