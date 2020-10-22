package edu.temple.colorchangingapp;

import android.app.Activity;
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
    OnColorSelectListener callback;
    public static PaletteFragment newInstance() {
        return new PaletteFragment();
    }

    public PaletteFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.palette_fragment, container, false);
        Context context = getActivity();

        Resources res = context.getResources();

        final String[] color_text = res.getStringArray(R.array.color_str);
        final String[] color = res.getStringArray(R.array.color_display);
        GridView grid = view.findViewById(R.id.colorGrid);

        GridViewAdapter adapter = new GridViewAdapter(context, color, color_text);

        grid.setAdapter(adapter);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String clicked_color = color[i];
                String clicked_color_text = color_text[i];
                callback.onColorSelect(clicked_color, clicked_color_text);
            }
        });
        return view;
    }

    public interface OnColorSelectListener{
        void onColorSelect(String color, String color_text);
    }

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        Activity activity = null;

        if (context instanceof Activity){
            activity = (Activity) context;
        }
        try{
            callback = (OnColorSelectListener) activity;
        } catch (ClassCastException E){
            throw new ClassCastException(getActivity().toString() + "Palette interface not implemented");
        }
    }

    @Override
    public void onDetach(){
        super.onDetach();
        callback = null;
    }



}
