package com.example.messenger_app;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //getSupportActionBar().hide(); // hide the title bar of the app


        new Handler().postDelayed(new Runnable(){ // create a new thread to run the app in the background while the splash screen is displayed
            @Override
            public void run(){
                Intent intent = new Intent(splash.this, MainActivity.class); // create an intent to start the main activity after 3 seconds (3000 milliseconds)
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}