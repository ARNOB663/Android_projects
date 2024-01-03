package com.example.recycelerview_pojo_sample;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

public CustomAdapter(Context mainActivity, List<Model> list) {
    this.context = mainActivity;
    this.list = list;
}
private Context context;
private List<Model> list;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
         View view = inflater.inflate(R.layout.product1, null);
         return new ViewHolder(view);
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
Model product1 = list.get(position);

holder.imageView.setImageDrawable(context.getResources().getDrawable(product1.getImage()));
holder.textViewTitle.setText(product1.getTitle());
holder.textViewShortDesc.setText(product1.getShortdesc());
holder.textViewRating.setText(String.valueOf(product1.getRating()));
holder.textViewPrice.setText(String.valueOf(product1.getPrice()));
//holder.textViewPrice.setText(String.valueOf(product1.getPrice()));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
     TextView textViewTitle;
        public TextView textViewShortDesc;
        public TextView textViewRating;
        public ImageView imageView;
        public TextView textViewPrice;
        public ViewHolder(View itemView) {
            super(itemView);
            textViewTitle = (TextView) itemView.findViewById(R.id.textViewTitle);
            textViewShortDesc = (TextView) itemView.findViewById(R.id.textViewShortDesc);
            textViewRating = (TextView) itemView.findViewById(R.id.textViewRating);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            textViewPrice = (TextView) itemView.findViewById(R.id.textViewPrice);
        }
    }
}
