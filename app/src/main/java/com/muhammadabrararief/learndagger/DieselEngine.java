package com.muhammadabrararief.learndagger;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = "DieselEngine";

    @Inject
    public DieselEngine() {
    }

    @Override
    public void start() {
        Log.e(TAG, "start: Diesel");
    }
}
