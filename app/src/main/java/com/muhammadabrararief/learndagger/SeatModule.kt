package com.muhammadabrararief.learndagger

import dagger.Module
import dagger.Provides

@Module
class SeatModule {

    @Provides
    fun provideSeatContent(): SeatContent {
        return SeatContent()
    }

    @Provides
    fun provideSeatCover(): SeatCover {
        val seatCover = SeatCover()
        seatCover.stitch()
        return seatCover
    }

    @Provides
    fun provideSeat(seatContent: SeatContent, seatCover: SeatCover): Seat {
        return Seat(seatCover, seatContent)
    }

}