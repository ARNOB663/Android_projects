package com.example.simple_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
ListView lv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv1=findViewById(R.id.list_view);
        String[] name = {"Ford","Mercedes-Benz","General Motors","BMW","Audi","Honda","Chevrolet","Hyundai","TOYOTA","Kia","Cadillac","Tesla","Volkswagen","Lexus","Jeep","Nissan"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,name);
        lv1.setAdapter(adapter);
    }
}