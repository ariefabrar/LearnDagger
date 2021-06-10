package com.muhammadabrararief.learndagger;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class Car {

    private static final String TAG = "Car";

    private Engine engine;
    private Wheel wheel;
    private Seat seat;

    @Inject
    public Car(@Named("electric") Engine engine, Wheel wheel, Seat seat) {
        this.seat = seat;
        this.engine = engine;
        this.wheel = wheel;
    }

    public void driving() {
        engine.start();
        Log.e(TAG, "driving...");
    }
}
