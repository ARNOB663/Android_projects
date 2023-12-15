package com.example.grid_view_with_image_adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridview=(GridView)findViewById(R.id.gridView);
        gridview.setAdapter(new imageAdapter(getApplicationContext()));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new  Intent(getApplicationContext(),MainActivity2.class);
                i.putExtra("id",position);
                startActivity(i);
            }
        });

    }
}