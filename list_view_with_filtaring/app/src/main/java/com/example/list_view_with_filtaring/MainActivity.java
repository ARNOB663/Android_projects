package com.example.list_view_with_filtaring;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class S_ListView_with_searchview_6 extends AppCompatActivity implements AdapterView.OnItemClickListener {


    // Array of strings...
    /*String[] myarray = {"Alikadam 4650","Naikhong 4610","WindowsMobile","Blackberry",
            "WebOS","Ubuntu","Windows7","Max OS X"};*/

    String[] myarray = {"Alikadam 4650","Naikhong 4610","WindowsMobile","Blackberry",
            "WebOS","Ubuntu","Windows7","Max OS X"};

    ListView lv;
    ArrayAdapter<String> adapter;

    // private SearchView searchView;a


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s__list_view_with_searchview_6);

        lv = (ListView) findViewById(R.id.tanalistid);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, myarray);

        lv.setAdapter(adapter);

        //-----------P2-------

        lv.setOnItemClickListener(this);

        //------------





  /*      sView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                adapter.getFilter().filter(newText);
                return false;
            }
        });
*/
        SearchView sView= (SearchView)findViewById(R.id.serachview);
        sView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                adapter.getFilter().filter(newText);
                return false;
            }
        });

        /*sView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {


                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);

                return false;
            }
        });*/



   /*     sView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);

                return false;
            }
        });
*/
     /*   sView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
                public boolean onQueryTextSubmit(String query) {
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
*/

//----------------------
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        String posi= myarray[position];

        Toast.makeText(this,posi+ " position is "+ position, Toast.LENGTH_SHORT).show();

        //Toast.makeText(this,posi,Toast.LENGTH_SHORT).show();
    }

    //-----------------------------
}