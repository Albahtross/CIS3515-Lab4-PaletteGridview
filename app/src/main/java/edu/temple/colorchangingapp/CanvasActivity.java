package edu.temple.colorchangingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        final Intent intent = getIntent();
        String color = intent.getStringExtra("color_string");
        final ConstraintLayout constraint = (ConstraintLayout)findViewById((R.id.constraint));

        TextView color_name = findViewById(R.id.color_name);
        color_name.setText(color);


        constraint.setBackgroundColor(Color.parseColor(color));

    }
}