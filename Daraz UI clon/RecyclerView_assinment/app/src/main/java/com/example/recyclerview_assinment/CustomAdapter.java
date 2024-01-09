package com.example.recyclerview_assinment;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.viewHolder>{
    private final ArrayList<String> ImageName;
    private final ArrayList<String> Image;

    private final ArrayList<String> mprice;
    private final Context context;

    public CustomAdapter(Context context, ArrayList<String> imageName, ArrayList<String> image, ArrayList<String> mprice) {
        ImageName = imageName;
        Image = image;
        this.mprice = mprice;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.customlayout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        holder.imageName.setText(ImageName.get(position));
        holder.price1.setText(mprice.get(position));

        Glide.with(context)
                .asBitmap()
                .load(Image.get(position))
                .placeholder(R.drawable.ic_launcher_foreground)
                .into(holder.image);

    }

    @Override
    public int getItemCount() {
        return ImageName.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView imageName;

        TextView price1;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageview_widget);
            imageName = itemView.findViewById(R.id.name_widget);
            price1 = itemView.findViewById(R.id.price);
        }
    }
}