package com.example.all_in_one_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DataPass2 extends AppCompatActivity {

    TextView tv;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_pass2);
        tv = findViewById(R.id.text_1);
        iv = findViewById(R.id.Image_2);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int resId = bundle.getInt("Github");
            iv.setImageResource(resId);
        }

        //Retrieve the product name and total price from the intent
        String productName = getIntent().getStringExtra("Name");
        double totalPrice = getIntent().getDoubleExtra("TotalPrice", 0.0);

        //Display the product name and total price in the TextView
        String Message = "Product: " + productName + "\nTotal Price: $" + totalPrice;
        tv.setText(Message);
    }
}