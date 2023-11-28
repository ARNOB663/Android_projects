package com.example.all_in_one_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DataPass extends AppCompatActivity {

    Button button;
    EditText et1, et2, et3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button_b_1);
        et1 = findViewById(R.id.et_1);
        et2 = findViewById(R.id.et_2);
        et3 = findViewById(R.id.et_3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Process Done", Toast.LENGTH_SHORT).show();
                //Get the input vlaues
                String porductName = et1.getText().toString().trim();
                int totalUnit = Integer.parseInt(et2.getText().toString());
                double perUnitPrice = Double.parseDouble(et3.getText().toString());

                //Calculate the total price
                double totalPrice = totalUnit * perUnitPrice;

                //Create an intent to pass data to the next activity
                Intent intent = new Intent(DataPass.this, DataPass2.class);
                intent.putExtra("Name", porductName);
                intent.putExtra("TotalPrice", totalPrice);
                intent.putExtra("Github", R.drawable.github);
                startActivity(intent);
            }
        });
    }
}