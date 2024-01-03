package com.example.recycelerview_pojo_sample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
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
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<>(); // create a list of Model class
        list.add(new Model("1", "Koenigsegg Agera RS", "Koenigsegg Agera RS ($2,550,000)", R.drawable.koenigsegg, 4.3, 	2550000));
       list.add(new Model("2", "Lamborghini Aventador", "Lamborghini Aventador ($393,695)", R.drawable.lamborghini, 4.5, 	393695));
 list.add(new Model("3", "Bugatti Chiron", "Bugatti Chiron ($2,998,000)", R.drawable.bugatti_chiron, 4.7, 	2998000));
 list.add(new Model("4", "aston martin", "aston martin ($1,000,000)", R.drawable.aston_martin_vulcan, 4.3, 	1000000));
 list.add(new Model("5", "Ferrari LaFerrari", "Ferrari LaFerrari ($1,416,362)", R.drawable.ferrari_laferrari, 4.5, 	1416362));
 list.add(new Model("6", "Pagani Huayra", "pagani ($1,400,000)", R.drawable.pagani_Huayra, 4.7, 	1400000));
 list.add(new Model("7", "McLaren P1", "McLaren P1 ($1,350,000)", R.drawable.mclaren_p1, 4.3, 	1350000));

 CustomAdapter adapter = new CustomAdapter(this, list);
recyclerView.setAdapter(adapter);
    }
}