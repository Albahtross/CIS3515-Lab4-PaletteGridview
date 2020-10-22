package edu.temple.colorchangingapp;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.FragmentManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;
//ahhh


public class MainActivity extends AppCompatActivity implements PaletteFragment.OnColorSelectListener{
    PaletteFragment paletteFragment;
    CanvasFragment canvasFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = this.getResources();


        TextView instructions = findViewById(R.id.instructions);
        instructions.setText(R.string.instructions);

        //final String[] colorArray = {"Blue","Black","Cyan","Gray", "Green","Magenta","Red","White", "Yellow"};

        FragmentManager fragmentManager = getSupportFragmentManager();

        paletteFragment = (PaletteFragment)fragmentManager.findFragmentById(R.id.palette_layout);
        if (paletteFragment == null){
            paletteFragment = new PaletteFragment();
            fragmentManager.beginTransaction().add(R.id.mainLayout, paletteFragment).commit();
        }

        canvasFragment = (CanvasFragment)fragmentManager.findFragmentById(R.id.canvas_layout);
        if (canvasFragment == null){
            canvasFragment = new CanvasFragment();
            fragmentManager.beginTransaction().add(R.id.mainLayout, canvasFragment).commit();
        }

    }

    @Override
    public void onColorSelect(String color, String color_text){
        canvasFragment.displayColor(color, color_text);
    }
}