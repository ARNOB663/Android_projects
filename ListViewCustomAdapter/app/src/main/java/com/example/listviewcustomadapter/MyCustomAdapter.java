package com.example.listviewcustomadapter;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyCustomAdapter extends BaseAdapter {
    private final Activity context;
    private final String[] division;
    private final String[] area;
    private final String[] population;
    private final Integer[] imgId;

    public MyCustomAdapter(Activity context, String[] division, String[] area, String[] population, Integer[] imgId) {
        this.context = context;
        this.division = division;
        this.area = area;
        this.population = population;
        this.imgId = imgId;
    }
private  class ViewHolder{
        TextView txtView1;
        TextView txtView2;
        TextView txtView3;
        ImageView imgView;
        public ViewHolder(View v){
            txtView1 = v.findViewById(R.id.tv_1);
            txtView2 = v.findViewById(R.id.tv_2);
            txtView3 = v.findViewById(R.id.tv_3);
            imgView = v.findViewById(R.id.iv_1);
        }
    }
    @Override
    public int getCount() {
        return division.length;
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

        ViewHolder holder = null;

       if(convertView == null) {
           LayoutInflater inflater = context.getLayoutInflater();
           convertView = inflater.inflate(R.layout.custom_layout, null, true);//for 70% perfomance incrice use convertview instead of rowview

              holder = new ViewHolder(convertView);
              convertView.setTag(holder);
       }
       else{
           holder = (ViewHolder)convertView.getTag();
         }
        TextView txtView1 = convertView.findViewById(R.id.tv_1);
        TextView txtView2 = convertView.findViewById(R.id.tv_2);
        TextView txtView3 = convertView.findViewById(R.id.tv_3);
        ImageView imgView = convertView.findViewById(R.id.iv_1);

        txtView1.setText(division[position]);
        txtView2.setText(area[position]);
        txtView3.setText(population[position]);
        imgView.setImageResource(imgId[position]);

        return convertView;
    }

}