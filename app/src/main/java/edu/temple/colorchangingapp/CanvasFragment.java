package edu.temple.colorchangingapp;


import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

public class CanvasFragment extends Fragment {
    private ConstraintLayout canvas_constraint;
    TextView color_name;


    public CanvasFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.canvas_fragment, container, false);
        canvas_constraint = view.findViewById(R.id.canvas_layout);
        color_name = view.findViewById(R.id.color_name);
        return view;
    }

    public void displayColor(String color, String color_text){

        canvas_constraint.setBackgroundColor(Color.parseColor(color));
        color_name.setText(color_text);

    }

}
