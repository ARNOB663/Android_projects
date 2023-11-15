package com.example.activiti_to_activiti_data_transfar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText et1, et2, et3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button_1);
        et1 = findViewById(R.id.Et_1);
        et2 = findViewById(R.id.Et_2);
        et3 = findViewById(R.id.Et_3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, MainActivity2.class);
                String ms1 = et1.getText().toString().trim();
                in.putExtra("Name", ms1);
                String ms2 = et2.getText().toString().trim();
                int result = Integer.parseInt(ms2);
                String ms3 = et3.getText().toString().trim();
                int result2 = Integer.parseInt(ms3);
                int mul = result * result2;
                in.putExtra("Result", mul);
                startActivity(in);
            }
        });
    }
}