package com.example.recycelerview_pojo_sample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Model> list; // create a list of Model class

    RecyclerView recyclerView; // create a recyclerview object

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new CustomAdapter(this, list));

        list = new ArrayList<>(); // create a list of Model class

        list.add(new Model("1", "Koenigsegg Agera RS", "This is product 1", R.drawable.koenigsegg, 4.3, 	2550000));


    }
}