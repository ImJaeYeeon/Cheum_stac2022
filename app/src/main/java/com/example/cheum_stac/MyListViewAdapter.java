package com.example.cheum_stac;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyListViewAdapter extends BaseAdapter {

    ArrayList<ListCon> items;
    Context context;

    public MyListViewAdapter(ArrayList<ListCon> items, Context context){
        this.items = items;
        this.context = context;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.map_search_listview, viewGroup, false);

        TextView tv_name = view.findViewById(R.id.text_store);
        tv_name.setText(items.get(i).store);

        return view;
    }
}