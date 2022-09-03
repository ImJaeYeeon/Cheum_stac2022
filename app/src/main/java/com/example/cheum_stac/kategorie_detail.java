package com.example.cheum_stac;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class kategorie_detail extends AppCompatActivity {
    ImageView news1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_kategorie_detail);
        news1 = findViewById(R.id.news1);
        news1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(kategorie_detail.this,kategorie_product.class);
                startActivity(intent);
                finish();
            }
        });
    }
}