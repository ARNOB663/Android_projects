package com.example.messenger_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.firebase.Firebase;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    FirebaseAuth auth;// = FirebaseAuth.getInstance(); // get an instance of the firebase authentication service

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        auth = FirebaseAuth.getInstance();// get an instance of the firebase authentication service
        if(auth.getCurrentUser() == null) {
            Intent intent = new Intent(MainActivity.this, login.class); // create an intent to start the login activity
            startActivity(intent);
    }
}