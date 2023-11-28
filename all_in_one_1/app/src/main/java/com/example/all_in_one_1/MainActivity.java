package com.example.all_in_one_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ListView lv1;
    EditText edit_text;
String[] item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv1 = findViewById(R.id.list_view);
        edit_text = findViewById(R.id.entrydata);


        Resources res =getResources();
        item = res.getStringArray(R.array.item);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,item);
        lv1.setAdapter(adapter);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {    Toast.makeText(getApplicationContext(),"picture",Toast.LENGTH_SHORT).show();
                    Intent myIntent=new Intent(view.getContext(),farrai_488_short.class);
                    startActivity(myIntent);

                }
                if(position==2)
                { Toast.makeText(getApplicationContext(),"camera",Toast.LENGTH_SHORT).show();
                    Intent i1= new Intent();
                    //i1.setAction(MediaStore.ACTION_VIDEO_CAPTURE);
                    i1.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivity(i1);
                }
                if(position==3)
                {
                    Toast.makeText(getApplicationContext(),"Going to : "+edit_text.getText(),Toast.LENGTH_SHORT).show();
                    Intent ii = new Intent();
                    ii.setAction(Intent.ACTION_VIEW);
//                ii.setData(Uri.parse("https://www.google.com/"));//For static
                    ii.setData(Uri.parse("https:" + edit_text.getText()));//For dynamic
                    startActivity(ii);
                }
            }
        });
        lv1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {  Toast.makeText(getApplicationContext(),"information",Toast.LENGTH_SHORT).show();
                    Intent myIntent=new Intent(view.getContext(),farrai_488_long.class);
                    startActivity(myIntent);
                }
                if(position==2)
                {  Toast.makeText(getApplicationContext(),"video",Toast.LENGTH_SHORT).show();
                    Intent i1= new Intent();
                    i1.setAction(MediaStore.ACTION_VIDEO_CAPTURE);
                    //i1.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivity(i1);
                }
                return false;
            }
        });
    }
}