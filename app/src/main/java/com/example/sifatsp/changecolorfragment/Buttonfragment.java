package com.example.sifatsp.changecolorfragment;

import android.app.Activity;
import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Sifatsp on 23/09/2017.
 */

public class Buttonfragment extends Fragment implements View.OnClickListener {

    private ChangeColorListener listener;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        if (!(activity instanceof ChangeColorListener)) {
            throw new IllegalArgumentException("A activity deve implementar a interface ChangeColorListener");
        }

        // Salva o listener para ser chamado mais tarde
        this.listener = (ChangeColorListener) activity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_buttons, container, false);

        ((Button) view.findViewById(R.id.btn_black)).setOnClickListener(this);
        ((Button) view.findViewById(R.id.btn_blue)).setOnClickListener(this);
        ((Button) view.findViewById(R.id.btn_green)).setOnClickListener(this);

        return view;

    }

    @Override
    public void onClick(View v) {

        int color = 0;
        int id = v.getId();

        if (id == R.id.btn_black){
            color = Color.BLACK;
        } else if (id == R.id.btn_blue){
            color = Color.BLUE;
        } else if (id == R.id.btn_green){
            color = Color.GREEN;
        }

        listener.changeColor(color);

    }

    public interface ChangeColorListener{
        public void changeColor(int color);
    }
}
