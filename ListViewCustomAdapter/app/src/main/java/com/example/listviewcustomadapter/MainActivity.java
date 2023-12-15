package com.example.listviewcustomadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView list;
    Spinner spin;

    String[] division = {"Dhaka", "Chittagong", "Rajshahi", "Sylhet", "Rangpur", "Barisal", "Khulna", "Mymensingh"};
    String[] area = {"20,509 km²", "34,530 km²", "18,174 km²", "12,298 km²", "16,185 km²", "13,225 km²", "22,284 km²", "10,584 km²"};
    String[] population = {"44,215,107", "33,202,326", "20,353,119", "11,034,863", "17,610,956", "9,325,820", "17,416,645", "12,225,498"};
    Integer[] imgId = {R.drawable.dhk, R.drawable.ctg, R.drawable.raj, R.drawable.syl, R.drawable.ran, R.drawable.bar, R.drawable.khu, R.drawable.mym};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.lv_1);
        spin = findViewById(R.id.sp_1);

        MyCustomAdapter listAdapter = new MyCustomAdapter(MainActivity.this, division, area, population, imgId);
        list.setAdapter(listAdapter);

        MyCustomAdapter listAdapter1 = new MyCustomAdapter(MainActivity.this, division, area, population, imgId);
        spin.setAdapter(listAdapter1);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(MainActivity.this, division[position], Toast.LENGTH_SHORT).show();
                } else if (position == 1) {
                    Toast.makeText(MainActivity.this, division[position], Toast.LENGTH_SHORT).show();
                } else if (position == 2) {
                    Toast.makeText(MainActivity.this, division[position], Toast.LENGTH_SHORT).show();
                } else if (position == 3) {
                    Toast.makeText(MainActivity.this, division[position], Toast.LENGTH_SHORT).show();
                } else if (position == 4) {
                    Toast.makeText(MainActivity.this, division[position], Toast.LENGTH_SHORT).show();
                } else if (position == 5) {
                    Toast.makeText(MainActivity.this, division[position], Toast.LENGTH_SHORT).show();
                } else if (position == 6) {
                    Toast.makeText(MainActivity.this, division[position], Toast.LENGTH_SHORT).show();
                } else if (position == 7) {
                    Toast.makeText(MainActivity.this, division[position], Toast.LENGTH_SHORT).show();
                }
            }
        });

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(MainActivity.this, division[position], Toast.LENGTH_SHORT).show();
                } else if (position == 1) {
                    Toast.makeText(MainActivity.this, division[position], Toast.LENGTH_SHORT).show();
                } else if (position == 2) {
                    Toast.makeText(MainActivity.this, division[position], Toast.LENGTH_SHORT).show();
                } else if (position == 3) {
                    Toast.makeText(MainActivity.this, division[position], Toast.LENGTH_SHORT).show();
                } else if (position == 4) {
                    Toast.makeText(MainActivity.this, division[position], Toast.LENGTH_SHORT).show();
                } else if (position == 5) {
                    Toast.makeText(MainActivity.this, division[position], Toast.LENGTH_SHORT).show();
                } else if (position == 6) {
                    Toast.makeText(MainActivity.this, division[position], Toast.LENGTH_SHORT).show();
                } else if (position == 7) {
                    Toast.makeText(MainActivity.this, division[position], Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(MainActivity.this, "Select something!", Toast.LENGTH_SHORT).show();
            }
        });


    }
}