package edu.temple.colorchangingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.palette_fragment);

        //final String[] colorArray = {"Blue","Black","Cyan","Gray", "Green","Magenta","Red","White", "Yellow"};

        Resources res = this.getResources();


        TextView instructions = findViewById(R.id.instructions);
        instructions.setText(R.string.instructions);



    }
}