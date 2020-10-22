package edu.temple.colorchangingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    PaletteFragment paletteFragment;
    CanvasFragment canvasFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //final String[] colorArray = {"Blue","Black","Cyan","Gray", "Green","Magenta","Red","White", "Yellow"};

        FragmentManager fragmentManager = getFragmentManager();

        paletteFragment = fragmentManager.findFragmentById(R.id.palette_layout);

        Resources res = this.getResources();


        TextView instructions = findViewById(R.id.instructions);
        instructions.setText(R.string.instructions);



    }
}