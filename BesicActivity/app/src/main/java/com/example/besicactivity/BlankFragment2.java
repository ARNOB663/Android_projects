package com.example.besicactivity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.ActivityKt;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class BlankFragment2 extends Fragment {

   View root;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        root=inflater.inflate(R.layout.fragment_blank2, container, false);
        Button bb=root.findViewById(R.id.button2);
        bb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                NavHostFragment.findNavController(BlankFragment2.this)
                         .navigate(R.id.action_blankFragment2_to_FirstFragment);
            }
        });
        return root;
    }
}