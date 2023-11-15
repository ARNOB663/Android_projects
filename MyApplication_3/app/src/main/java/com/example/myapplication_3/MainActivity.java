package com.example.myapplication_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
 Button move;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        move= findViewById(R.id.button1);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent1= new Intent(MainActivity.this,MainActivity_sf90.class);
               startActivity(intent1);
            }
        });
        move = findViewById(R.id.button2);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(MainActivity.this,MainActivity_fxxk.class);
                startActivity(intent2);
            }
        });
        move = findViewById(R.id.button3);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3= new Intent(MainActivity.this,MainActivity_la_ferrari.class);
                startActivity(intent3);
            }
        });
        move = findViewById(R.id.button4);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3= new Intent(MainActivity.this,MainActivity_pista.class);
                startActivity(intent3);
            }
        });
        move = findViewById(R.id.button5);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3= new Intent(MainActivity.this,MainActivity_roma.class);
                startActivity(intent3);
            }
        });
        move= findViewById(R.id.button6);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1= new Intent(MainActivity.this,MainActivity_puro.class);
                startActivity(intent1);
            }
        });
    }
}