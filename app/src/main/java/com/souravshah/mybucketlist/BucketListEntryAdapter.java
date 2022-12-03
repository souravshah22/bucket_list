package com.souravshah.mybucketlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BucketListEntryAdapter extends RecyclerView.Adapter<BucketListEntryAdapter.BucketListEntryViewHolder> {

    BucketListEntry[] entries;

    public BucketListEntryAdapter(BucketListEntry[] entries) {
        this.entries = entries;
    }

    @Override
    public int getItemCount() {
        return entries.length;
    }

    @NonNull
    @Override
    public BucketListEntryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_buckest_list_entry,parent,false);
        return new BucketListEntryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BucketListEntryViewHolder holder, int position) {
holder.bind(entries[position],position);
    }



    static class BucketListEntryViewHolder extends RecyclerView.ViewHolder{

       private ImageView image;
       private TextView headerText;
       private TextView description;
       private RatingBar ratingbar;


    public BucketListEntryViewHolder(@NonNull View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.image_view_item_picture);
        headerText = itemView.findViewById(R.id.text_view_heading);
        description = itemView.findViewById(R.id.text_view_description);
        ratingbar = itemView.findViewById(R.id.rating_bar);
    }
public void bind(BucketListEntry entry,int position){
image.setImageResource(entry.image);
String headerString = position + 1 + " . " + entry.heading;
headerText.setText(headerString);
description.setText(entry.description);
ratingbar.setRating(entry.Rating);
}

    }
}
