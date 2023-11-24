package com.example.simple_spinal;
import androidx.appcompat.app.AppCompatActivity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Spinner lv1;
    String[] CTGTHANA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv1 = findViewById(R.id.spinner1);
        Resources res = getResources();
        String[] name = {"Ford","Mercedes-Benz","General Motors","BMW","Audi","Honda","Chevrolet","Hyundai","TOYOTA","Kia","Cadillac","Tesla","Volkswagen","Lexus","Jeep","Nissan"};
        //CTGTHANA = res.getStringArray(R.array.CTGTHANA);
        List<String> listca;
        listca = new ArrayList<>();
        for (String i: name)
        {
            listca.add(i);
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.custom_diesne,R.id.textView,listca);
        lv1.setAdapter(adapter);
        //lv2=findViewById(R.id.spinner);
    }
}