package com.muhammadabrararief.learndagger;

import android.util.Log;

import javax.inject.Inject;

public class ElectricEngine implements Engine {
    private static final String TAG = "ElectricEngine";

    @Inject
    public ElectricEngine() {
    }

    @Override
    public void start() {
        Log.e(TAG, "start: Electric");
    }
}
