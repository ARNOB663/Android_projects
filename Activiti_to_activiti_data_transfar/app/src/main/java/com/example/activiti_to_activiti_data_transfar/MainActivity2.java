package com.example.activiti_to_activiti_data_transfar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv = findViewById(R.id.TextView_1);
        String value1 = getIntent().getExtras().getString("Name");
        tv.setText(value1);
        int value2 = getIntent().getIntExtra("Result", 0);
        tv.append("\nTotal Price: " + value2);
    }
}