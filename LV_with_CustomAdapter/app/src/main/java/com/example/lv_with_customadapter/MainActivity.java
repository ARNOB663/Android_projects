package com.example.lv_with_customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    ListView lv;

    Spinner sp;

    String[] district = {"Dhaka","Chittagong","Rangpur","Sylhet","Mymensingh"};

    Integer[] ImageId ={R.drawable.dhaka,R.drawable.chittagong,R.drawable.rangpur,R.drawable.sylhet,R.drawable.mymensingh};

    String[] area = {"306.4 km²","168.1 km²","2,401 km²","26.5 km²","91.32 km²"};

    String[] population = {"23,210,000","5,380,000","435,000","964,000","487,000"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.lv1);

        CustomAdapter listAdapter = new CustomAdapter(MainActivity.this, district,ImageId,area, population);
        lv.setAdapter(listAdapter);

        sp = (Spinner) findViewById(R.id.sp1);
        CustomAdapter listAdapter1 = new CustomAdapter(MainActivity.this, district,ImageId,area, population);
        sp.setAdapter(listAdapter1);
    }
}