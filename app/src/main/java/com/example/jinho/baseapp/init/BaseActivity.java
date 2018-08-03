package com.example.jinho.baseapp.init;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {

    private final String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void onResume() {
        super.onResume();
        Logger.d(TAG + "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Logger.d(TAG + "onPause");
    }


}
