package com.example.jinho.baseapp.init;

import android.app.Application;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Logger.init("BaseApp", true);

    }
}
