package edu.temple.colorchangingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

        final String[] colorArray = {"Blue","Black","Cyan","Gray", "Green","Magenta","Red","White", "Yellow"};


        GridViewAdapter adapter = new GridViewAdapter(this, colorArray);

        grid.setAdapter(adapter);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(PaletteActivity.this, CanvasActivity.class);
                intent.putExtra("color_string", (String) colorArray[i]);
                startActivity(intent);
            }
        });

    }
}