package edu.temple.colorchangingapp;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class GridViewAdapter extends BaseAdapter {

    String [] colors;
    String [] color_text;
    Context context;

    public GridViewAdapter(Context context, String [] colors, String [] color_text) {
        this.context = context;
        this.colors = colors;
        this.color_text = color_text;
    }

    @Override public int getCount(){
        return colors.length;
    }

    @Override
    public Object getItem(int position){
        return colors[position];
    }

    @Override
    public long getItemId(int position){
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup){
        TextView textView = new TextView(context);

        textView.setText(color_text[position]);
        textView.setBackgroundColor(Color.parseColor(colors[position]));

        return textView;
    }
}
