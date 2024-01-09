package com.example.staggeredrecyclerviewadapter;


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

import de.hdodenhof.circleimageview.CircleImageView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.viewHolder>{
    private ArrayList<String> ImageName;
    private ArrayList<String> Image;
    private Context context;

    public CustomAdapter(Context context,ArrayList<String> imageName, ArrayList<String> image) {
        ImageName = imageName;
        Image = image;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.customlayout,parent,false);
        viewHolder holder = new viewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        holder.imageName.setText(ImageName.get(position));

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
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageview_widget);
            imageName = itemView.findViewById(R.id.name_widget);
        }
    }
}