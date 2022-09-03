package com.example.cheum_stac;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class home_news extends AppCompatActivity {
    Button news_videoBtn,news_newsBtn;
    ImageView news1,news2,news3,news4;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home_news);
        news_videoBtn = findViewById(R.id.news_videoBtn);
        news_newsBtn = findViewById(R.id.news_newsBtn);
        news1 = findViewById(R.id.news1);
        news2 = findViewById(R.id.news2);
        news3 = findViewById(R.id.news3);

        news_videoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home_news.this,home_video.class);
                startActivity(intent);
                finish();
            }
        });
        news_newsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home_news.this,home_news.class);
                startActivity(intent);
                finish();
            }
        });
        news1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home_news.this,home_news_page.class);
                startActivity(intent);
                finish();
            }
        });
    }

}