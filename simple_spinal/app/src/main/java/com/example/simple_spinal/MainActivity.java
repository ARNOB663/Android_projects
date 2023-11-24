package com.example.simple_spinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner lv1;
    String[] CTGTHANA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv1=findViewById(R.id.spinner1);
        Resources res =getResources();
        CTGTHANA = res.getStringArray(R.array.CTGTHANA);

        //String[] name = {"Ford","Mercedes-Benz","General Motors","BMW","Audi","Honda","Chevrolet","Hyundai","TOYOTA","Kia","Cadillac","Tesla","Volkswagen","Lexus","Jeep","Nissan"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,CTGTHANA);
        lv1.setAdapter(adapter);
        //lv2=findViewById(R.id.spinner);
    }
}