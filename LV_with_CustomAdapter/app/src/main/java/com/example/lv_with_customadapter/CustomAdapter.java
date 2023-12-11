package com.example.lv_with_customadapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    private final Activity context;

    private final String[] district;

    private final Integer[] ImageId;




    public CustomAdapter(Activity context, String[] district, Integer[] imageId) {
        this.context = context;
        this.district = district;
        ImageId = imageId;

    }

    @Override
    public int getCount() {
        return district.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowview = inflater.inflate(R.layout.custadp,null,true);

        TextView textView = (TextView) rowview.findViewById(R.id.txt);

        ImageView imageView = (ImageView) rowview.findViewById(R.id.img1);

        textView.setText(district[position]);

        imageView.setImageResource(ImageId[position]);

        return rowview;
    }
}
