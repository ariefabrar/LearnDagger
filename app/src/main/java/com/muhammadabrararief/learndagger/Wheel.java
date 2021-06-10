package com.muhammadabrararief.learndagger;

import android.util.Log;

import javax.inject.Inject;

public class Wheel {
    private static final String TAG = "Wheel";

    private Velg velg;
    private Tire tire;

    @Inject
    public Wheel(Velg velg, Tire tire) {
        this.velg = velg;
        this.tire = tire;
    }

    public void spin() {
        Log.e(TAG, "spinning...");
    }
}
