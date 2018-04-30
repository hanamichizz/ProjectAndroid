package com.example.hanamichiz.projectandroid;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ActionMode;

public class HomeActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeInternt = new Intent(HomeActivity.this, HomeActivity.class);
                startActionMode((ActionMode.Callback) homeInternt);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}