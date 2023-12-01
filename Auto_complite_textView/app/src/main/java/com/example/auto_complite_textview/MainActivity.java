package com.example.auto_complite_textview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    MultiAutoCompleteTextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   textView = findViewById(R.id.multiAutoCompleteTextView);
        String[] countries = getResources().getStringArray(R.array.text1);
        Build.VERSION_CODES andriod;
        //ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, andriod.R.layout.simple.list_item_1,countries);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, countries);
        textView.setAdapter(adapter);

        textView.setThreshold(1);
        textView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

        Button button = findViewById(R.id.button);
        button.setOnClickListener(v -> {
            String text = textView.getText().toString();
            Toast.makeText(getApplicationContext(),text,Toast.LENGTH_SHORT).show();

        });
}}