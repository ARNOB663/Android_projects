package com.example.simple_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
ListView lv1;
String[] CTGTHANA;
ListView lv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv1=findViewById(R.id.list_view);
        Resources res =getResources();
        CTGTHANA = res.getStringArray(R.array.CTGTHANA);
        
        //String[] name = {"Ford","Mercedes-Benz","General Motors","BMW","Audi","Honda","Chevrolet","Hyundai","TOYOTA","Kia","Cadillac","Tesla","Volkswagen","Lexus","Jeep","Nissan"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,CTGTHANA);
        lv1.setAdapter(adapter);
        lv2=findViewById(R.id.list_view2);
        Integer[] name2={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,20};
        ArrayAdapter<Integer> adapter1 = new ArrayAdapter<Integer>(getApplicationContext(),android.R.layout.simple_list_item_1,name2);
        lv2.setAdapter(adapter1);

    }
}rioo