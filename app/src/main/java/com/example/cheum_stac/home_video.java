package com.example.cheum_stac;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class home_video extends AppCompatActivity {
    Button video_videoBtn, video_newsBtn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home_video);
        video_videoBtn = findViewById(R.id.video_videoBtn);
        video_newsBtn = findViewById(R.id.video_newsBtn);

        video_videoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home_video.this,home_video.class);
                startActivity(intent);
                finish();
            }
        });
        video_newsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home_video.this,home_news.class);
                startActivity(intent);
                finish();
            }
        });

    }

}