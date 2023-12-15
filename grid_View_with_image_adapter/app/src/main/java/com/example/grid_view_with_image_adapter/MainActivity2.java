package com.example.grid_view_with_image_adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i=getIntent();

        int position=i.getExtras().getInt("id");
        imageAdapter imageAdapter=new imageAdapter(this);
        ImageView imageView=(ImageView)findViewById(R.id.imageView2);

        imageView.setImageResource(imageAdapter.imageArry[position]);
    }
}