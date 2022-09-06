package com.example.cheum_stac;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MapSearch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_search);

        ListView listView = findViewById(R.id.listview_search);

        ArrayList<ListCon> items = new ArrayList<>();
        items.add(new ListCon("알맹상점"));
        items.add(new ListCon("알맹상점"));
        items.add(new ListCon("알맹상점"));

        MyListViewAdapter adapter = new MyListViewAdapter(items, getApplicationContext());
        listView.setAdapter(adapter);
    }
}