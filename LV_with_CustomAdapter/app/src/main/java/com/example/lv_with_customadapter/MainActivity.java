package com.example.lv_with_customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    ListView lv;

    Spinner sp;

    String[] district = {"GTA 6 release date year confirmed by first trailer","Rumor: Possible PS5 Pro Specs Leak Online","RED DEAD REDEMPTION 3 ‘OFFICIALLY IN THE WORKS’, IT’S CLAIMED","There Are Some Amazing PC Game Deals In Fanatical's Winter Sale"};

    Integer[] ImageId ={R.drawable.gta6,R.drawable.ps5_pro,R.drawable.rdr3,R.drawable.g1};

    //String[] area = {"306.4 km²","168.1 km²","2,401 km²","26.5 km²","91.32 km²"};

    //String[] population = {"23,210,000","5,380,000","435,000","964,000","487,000"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.lv1);

        CustomAdapter listAdapter = new CustomAdapter(MainActivity.this, district,ImageId);
        lv.setAdapter(listAdapter);

        sp = (Spinner) findViewById(R.id.sp1);
        CustomAdapter listAdapter1 = new CustomAdapter(MainActivity.this, district,ImageId);
        sp.setAdapter(listAdapter1);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if( position == 0)
                {
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                }
                if (position == 1)
                {
                    Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                    startActivity(intent);
                }
                if (position == 2)
                {
                    Intent intent = new Intent(MainActivity.this, MainActivity4.class);
                    startActivity(intent);
                }
                if (position == 3)
                {
                    Intent intent = new Intent(MainActivity.this, MainActivity5.class);
                    startActivity(intent);
                }
            }
        });
    }
}