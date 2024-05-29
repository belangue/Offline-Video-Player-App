package com.offlinevideoplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class VideoListAdapter extends ArrayAdapter<Video> {
    private final Context context;
    private final ArrayList<Video> data;
    public VideoListAdapter(Context context, ArrayList<Video> data) {
        super(context, R.layout.itemvideo_layout, data);
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Inflate the item_card layout
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.itemvideo_layout, parent, false);

        // Get the TextView and ImageView and basic items
        TextView textView = view.findViewById(R.id.map_item_title);
        TextView durationView = view.findViewById(R.id.map_item_duration);
        ImageView imageView = view.findViewById(R.id.map_item_image);  // Get the ImageView by ID
        // Set the data for the current list item
        textView.setText(data.get(position).name);
        durationView.setText(data.get(position).duration);
        imageView.setImageResource(data.get(position).imageResourceId);  // Example using a drawable resource
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = data.get(position).name;
                String duration = data.get(position).duration;
                String imageResource = String.valueOf(data.get(position).imageResourceId);
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("duration", duration);
                intent.putExtra("imageResourceId",imageResource);
                context.startActivity(intent);
            }
        });
        return view;
    }
}
