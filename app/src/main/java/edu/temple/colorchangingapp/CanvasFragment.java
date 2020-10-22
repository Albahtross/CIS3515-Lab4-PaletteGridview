package edu.temple.colorchangingapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

public class CanvasFragment extends Fragment {
    private ConstraintLayout constraintLayout;

    public CanvasFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.canvas_fragment, container, false);
        constraintLayout = view.findViewById(R.id.constraint);
        return view;
    }


}
