package com.example.lionthai.myapplication;

import android.app.Application;

import com.example.lionthai.myapplication.manger.Contextor;

public class Aplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
             Contextor.getInstance().init(getApplicationContext());
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
