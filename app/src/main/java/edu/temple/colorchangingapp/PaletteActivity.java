package edu.temple.colorchangingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class PaletteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

        GridView grid = (GridView)findViewById(R.id.colorGrid);

        //final String[] colorArray = {"Blue","Black","Cyan","Gray", "Green","Magenta","Red","White", "Yellow"};

        Resources res = this.getResources();
        final String[] color_text = res.getStringArray(R.array.palette_str);
        String[] colors = res.getStringArray(R.array.color_palette);


        GridViewAdapter adapter = new GridViewAdapter(this, colors, color_text);

        grid.setAdapter(adapter);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(PaletteActivity.this, CanvasActivity.class);
                intent.putExtra("color_string", (String) color_text[i]);
                startActivity(intent);
            }
        });

    }
}