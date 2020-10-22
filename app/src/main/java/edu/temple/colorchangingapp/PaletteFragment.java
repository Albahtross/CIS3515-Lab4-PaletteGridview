package edu.temple.colorchangingapp;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.fragment.app.Fragment;

public class PaletteFragment extends Fragment {
    public static PaletteFragment newInstance(){
        return new PaletteFragment();
    }

    public PaletteFragment(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.palette_fragment, container, false);
        Context context = getActivity();
        Resources res = context.getResources();

        final String[] color_text = res.getStringArray(R.array.palette_str);
        final String[] colors = res.getStringArray(R.array.color_palette);
        GridView grid = (GridView)findViewById(R.id.colorGrid);

        GridViewAdapter adapter = new GridViewAdapter(context, colors, color_text);

        grid.setAdapter(adapter);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, CanvasActivity.class);
                intent.putExtra("color_string", (String) color_text[i]);
                intent.putExtra("color", (String) colors[i]);
                startActivity(intent);
            }
        });
        return view;
    }


}
