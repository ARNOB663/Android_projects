package com.example.creating_list_viewusinglistactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ListActivity {
    String[] marray= {"abrar","jawad","asif","anika","muskhy","bijoy","aqila","faqlia","saqila","maqila"};
    ListView lv;
    TextView text1;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        lv = getListView();

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,marray);

        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String post= marray[position];
                Toast.makeText(MainActivity.this,post+"position is"+position,Toast.LENGTH_SHORT).show();
                TextView text1 = findViewById(R.id.textView);
                text1.setText(marray[position]);
            }
        });
    }
}