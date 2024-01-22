package com.example.basicview2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import java.util.ArrayList;
import java.util.HashMap;

public class BlankFragment extends Fragment {
    View root;
    ListView simpleListView;
    String[] carName = {"Acura", "Aston Martin", "Audi", "BMW", "Cobalt", "Ferrari", "Honda", "Lamborghini", "Mazda", "Mercedes", "Mustang", "Nissan", "Porsche", "Toyota"};
    int[] carImages = {
            R.drawable.acura,
            R.drawable.aston_martin,
            R.drawable.audi,
            R.drawable.bmw,
            R.drawable.cobalt,
            R.drawable.ferrari,
            R.drawable.honda,
            R.drawable.lamborghini,
            R.drawable.mazda,
            R.drawable.mercedes,
            R.drawable.mustang,
            R.drawable.nissan,
            R.drawable.porsche,
            R.drawable.toyota
    };
    String[] carType = {"Sedan", "Sedan", "Sedan", "Sedan", "Family Car", "Sports Car", "Sedan", "Sports Car", "Truck", "Sports Car", "Sports Car", "SUV", "Sports Car", "Sports Car"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_blank, container, false);

        Button buttonSecond = root.findViewById(R.id.button_second);

        buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(BlankFragment.this)
                        .navigate(R.id.action_blankFragment_to_blankFragment2);
            }
        });

        simpleListView = root.findViewById(R.id.listView);

        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();

        for (int i = 0; i < carName.length; i++) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("name", carName[i]);
            hashMap.put("image", carImages[i] + "");
            hashMap.put("type", carType[i]);
            arrayList.add(hashMap);
        }

        String[] from = {"name", "image", "type"};
        int[] to = {
                R.id.car_name,
                R.id.car_image,
                R.id.car_type,
        };

        SimpleAdapter simpleAdapter = new SimpleAdapter(getActivity(), arrayList, R.layout.custom_layout, from, to);
        simpleListView.setAdapter(simpleAdapter);

        simpleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "Position: " + position, Toast.LENGTH_SHORT).show();
            }
        });

        return root;
    }
}