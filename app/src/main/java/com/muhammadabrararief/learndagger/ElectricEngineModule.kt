package com.muhammadabrararief.learndagger

import dagger.Binds
import dagger.Module
import javax.inject.Named

@Module
abstract class ElectricEngineModule {

    @Binds
    @Named("electric")
    abstract fun bindElectircEngine(electricEngine: ElectricEngine): Engine

    @Binds
    @Named("diesel")
    abstract fun bindDieselEngine(dieselEngine: DieselEngine): Engine

}