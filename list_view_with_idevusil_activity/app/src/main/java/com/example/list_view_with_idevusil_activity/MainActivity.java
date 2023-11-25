package com.example.list_view_with_idevusil_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lv1;
    String[] data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv1 = findViewById(R.id.list_item);
        Resources res =getResources();
        data = res.getStringArray(R.array.topic);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,data);
        lv1.setAdapter(adapter);
lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(position==0)
        {
            Intent myIntent=new Intent(view.getContext(),MainActivity2.class);
            startActivity(myIntent);
        }
        if(position==1)
        {
            Intent myIntent=new Intent(view.getContext(),MainActivity3.class);
            startActivity(myIntent);
        }
        if(position==2)
        {
            Intent myIntent=new Intent(view.getContext(), MainActivity4.class);
            startActivity(myIntent);
        }
        if(position==3)
        {
            Intent myIntent=new Intent(view.getContext(),MainActivity5.class);
            startActivity(myIntent);
        }
    }
});
    }
}