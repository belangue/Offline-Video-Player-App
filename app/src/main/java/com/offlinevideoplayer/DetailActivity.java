package com.offlinevideoplayer;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    private LinearLayout imageView;
//    private Button rentButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_detail);

        // Get references to UI elements
        this.imageView = findViewById(R.id.video_image_view);
        TextView nameTextView = findViewById(R.id.video_title);
        ImageView backButton = findViewById(R.id.car_detail_back);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView startBtn = findViewById(R.id.start_btn);
        Button preBtn = findViewById(R.id.pre_btn);
        Button nextBtn = findViewById(R.id.next_btn);
        nameTextView.setText("Anderson");

        // Get data from the Intent (optional)
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("name")) {
            String name = intent.getStringExtra("name");
            String duration = intent.getStringExtra("duration");
            String image = intent.getStringExtra("imageResourceId");
            int imageResourceId = Integer.parseInt(image);

            // Update UI elements with car data (replace with your logic)
            nameTextView.setText(name);
//            durationView.setText(duration);
            imageView.setBackground(getResources().getDrawable(imageResourceId));
//                    setImageResource(imageResourceId); // Example for a specific car image
        }

        // Set click listener for rent button (handle rental logic here)
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle rent button click (e.g., show rental confirmation or navigate to rental process)
                Toast.makeText(DetailActivity.this, "Next button clicked!", Toast.LENGTH_SHORT).show();
            }
        });
        preBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle rent button click (e.g., show rental confirmation or navigate to rental process)
                Toast.makeText(DetailActivity.this, "Prev button clicked!", Toast.LENGTH_SHORT).show();
            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailActivity.this, MainActivity.class);
                startActivity(intent);}
        });
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DetailActivity.this, "Start button clicked!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}


