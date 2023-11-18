package com.example.menu_prectice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    //Method for Creating a Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    //Method for item selection
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        ImageView imageView = findViewById(R.id.action_image);
        if(id == R.id.action_elephant){
            imageView.setImageResource(R.drawable.elephant);
        } else if (id == R.id.action_dog) {
            imageView.setImageResource(R.drawable.dog);
        } else if (id == R.id.action_cat) {
            imageView.setImageResource(R.drawable.cat);
        } else if (id == R.id.action_giraffe) {
            imageView.setImageResource(R.drawable.girrafe);
        }
        else{
            imageView.setImageResource(R.drawable.gear);
        }
        return super.onOptionsItemSelected(item);
}
}