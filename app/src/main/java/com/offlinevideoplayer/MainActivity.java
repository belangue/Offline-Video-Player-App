package com.offlinevideoplayer;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.item_list);
        ArrayList<Video> data = new ArrayList<>();
        data.add(new Video("Fast and Furious X","3:10:00",R.drawable.p1));
        data.add(new Video("The Witcher","56:00",R.drawable.p3));
        data.add(new Video("John wick","1:40:00",R.drawable.p2));
        data.add(new Video("One piece","23:00",R.drawable.p6));
        data.add(new Video("Naruto","24:00",R.drawable.p5));
        data.add(new Video("Death note","30:00",R.drawable.p4));
        VideoListAdapter adapter = new VideoListAdapter(this, data);
        listView.setAdapter(adapter);
    }
}