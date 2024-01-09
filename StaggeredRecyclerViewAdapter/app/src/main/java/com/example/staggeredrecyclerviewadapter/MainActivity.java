package com.example.staggeredrecyclerviewadapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private static final int NUM_COLUMNS=2;
    private ArrayList<String>mNames=new ArrayList<>();
    private ArrayList<String>mImageUrls= new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        initRecyclerView();

    }



    private void initRecyclerView(){
        RecyclerView recyclerView= findViewById(R.id.recyclerview);

        CustomAdapter adapter = new CustomAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        StaggeredGridLayoutManager staggeredGridLayoutManager =new StaggeredGridLayoutManager(NUM_COLUMNS,LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);


//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        mImageUrls.add("https://i.pinimg.com/564x/5e/c1/7c/5ec17cdef6fe90f9ace11ee7af6d3603.jpg");
        mNames.add("Sun");

        mImageUrls.add("https://i.pinimg.com/564x/ca/2c/8e/ca2c8e5265cc1aa9e18004333117b3e3.jpg");
        mNames.add("Earth");

        mImageUrls.add("https://i.pinimg.com/564x/60/52/66/605266db68ea2c23b08b2d9b4eda2424.jpg");
        mNames.add("Venus");
        mImageUrls.add("https://i.pinimg.com/564x/ef/d2/b9/efd2b98be6bfc73d6c483adf648dd46b.jpg");
        mNames.add("Saturn");


        mImageUrls.add("https://i.pinimg.com/564x/5d/1c/bf/5d1cbf41e21fad841fea6bbb65bcc679.jpg");
        mNames.add("Mercury");

        mImageUrls.add("https://i.pinimg.com/564x/c1/9b/35/c19b354b65e44e93c89cac8da5c2b69f.jpg");
        mNames.add("Uranus");

        mImageUrls.add("https://i.pinimg.com/564x/48/08/d8/4808d86107d066b1f3c20106b0612c3b.jpg");
        mNames.add("Mars");

        mImageUrls.add("https://i.pinimg.com/564x/28/41/14/284114e89a9ae8522bc5badf99d718c9.jpg");
        mNames.add("Neptune");


        mImageUrls.add("https://i.pinimg.com/564x/59/f8/e4/59f8e4e5b0e7819da863b0e41df3d1a7.jpg");
        mNames.add("Jupiter");




    }
}