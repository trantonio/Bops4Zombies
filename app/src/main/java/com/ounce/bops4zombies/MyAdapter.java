package com.ounce.bops4zombies;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

class MyAdapter extends RecyclerView.Adapter<MyAdapter.ImageViewHolder> {

    public class ImageViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;

        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imgPista);
        }
    }

    List<Image> images;

    public MyAdapter(List<Image> images) {
        this.images = images;
    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.image_item_adapter, viewGroup, false);
        ImageViewHolder ivh = new ImageViewHolder(view);
        return ivh;
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder imageViewHolder, int i) {
        imageViewHolder.imageView.setImageResource(images.get(i).photoId);
    }
}
