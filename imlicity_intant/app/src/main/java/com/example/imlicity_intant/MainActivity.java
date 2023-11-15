package com.example.imlicity_intant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button v_camra,v_contactlist,v_imagegallary,v_dial,v_browser;
EditText edit_text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_text = findViewById(R.id.entrydata);
        v_camra= findViewById(R.id.b_camra);
        v_contactlist = findViewById(R.id.b_contact_list);
        v_imagegallary=findViewById(R.id.b_image);
        v_dial = findViewById(R.id.b_dial);
        v_browser = findViewById(R.id.button4);
        //camra
       v_camra.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i1= new Intent();
               //i1.setAction(MediaStore.ACTION_VIDEO_CAPTURE);
               i1.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
               startActivity(i1);
           }
       });
       v_camra.setOnLongClickListener(new View.OnLongClickListener() {
           @Override
           public boolean onLongClick(View v) {
               Intent i1= new Intent();
               i1.setAction(MediaStore.ACTION_VIDEO_CAPTURE);
               //i1.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
               startActivity(i1);
               return true;
           }
       });
       v_contactlist.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i2 = new Intent();
               i2.setAction(Intent.ACTION_VIEW);


               i2.setData(Uri.parse("content://contacts//people/"));
               startActivity(i2);
           }
       });
        v_imagegallary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent();
                i1.setAction(Intent.ACTION_VIEW);
                i1.setData(Uri.parse("tel:" + edit_text.getText()));
                startActivity(i1);
            }
        });
        v_dial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent();
                i1.setAction(Intent.ACTION_DIAL);
                i1.setData(Uri.parse("content://"));
                startActivity(i1);
            }
        });
        v_browser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent();
                i1.setAction(Intent.ACTION_VIEW);
                i1.setData(Uri.parse("https://www.google.com/"));
                i1.setData(Uri.parse("tel:" + edit_text.getText()));
                startActivity(i1);
            }
        });
    }
}