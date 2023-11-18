package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button b_var_1;
    private Button b_var_2;
    private Button b_var_3;
    private Button b_var_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_var_1 =(Button)findViewById(R.id.b_one) ;
        b_var_2 = (Button) findViewById(R.id.b_two);
        b_var_3 = (Button) findViewById(R.id.b_three);
        b_var_4 = (Button) findViewById(R.id.b_four);

        b_var_1.setOnClickListener(this);
        b_var_2.setOnClickListener(this); // calling onClick() method
        b_var_3.setOnClickListener(this);
        b_var_4.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.b_one:
                bclick_one();
                break;

            case R.id.b_two:
                bclick_two();
                break;

            case R.id.b_three:
                bclick_three();
                break;

            case R.id.b_four:
                bclick_four();
                break;

            default:
                break;
        }

    }
    private void bclick_one() {

        b_var_1.setText("stamasoft!");
        Toast.makeText(getApplicationContext(),"one show stamasoft",Toast.LENGTH_LONG).show();
    }
    private void bclick_two() {
        b_var_2.setText("ethu!");
    }

    private void bclick_three() {

        b_var_3.setText("babu!");
    }

    private void bclick_four() {
        b_var_4.setText("rased!");
}

}//mlb