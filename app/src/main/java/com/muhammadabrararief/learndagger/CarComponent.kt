package com.muhammadabrararief.learndagger

import dagger.Component

@Component(modules = [SeatModule::class, ElectricEngineModule::class])
interface CarComponent {

    fun getCar(): Car

    fun getWheel(): Wheel

    fun inject(mainActivity: MainActivity)

}