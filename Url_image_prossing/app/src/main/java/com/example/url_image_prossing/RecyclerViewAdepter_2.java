package com.example.url_image_prossing;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdepter_2 extends RecyclerView.Adapter<RecyclerViewAdepter_2.ViewHolder> {
    private static final String TAG = "RecyclerViewAdepter_2";
    private ArrayList<String> mImageNames;
    private ArrayList<String> mImages;
    private Context mContext;

    public RecyclerViewAdepter_2(Context mContext, ArrayList<String> mImageNames, ArrayList<String> mImages) {
        this.mImageNames = mImageNames;
        this.mImages = mImages;
        this.mContext = mContext;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.customlayout, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.imageName.setText(mImageNames.get(position));
        // Log.d(TAG, "onBindViewHolder: called.");
        Glide.with(mContext)
                .asBitmap()
                .load(mImages.get(position)).placeholder(R.drawable.ic_launcher_background)
                .into(holder.image);

    }


    @Override
    public int getItemCount() {
        // Log.d(TAG, "getItemCount: called.");
        return mImageNames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        // Log.d(TAG, "ViewHolder: called.");
        CircleImageView image;
        TextView imageName;


        public ViewHolder( View itemView) {
            super(itemView);
            // Log.d(TAG, "ViewHolder: called.");
            image = itemView.findViewById(R.id.image);
            imageName = itemView.findViewById(R.id.image_name);
            //parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}
