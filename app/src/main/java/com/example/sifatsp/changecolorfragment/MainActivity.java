package com.example.sifatsp.changecolorfragment;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;

public class MainActivity extends AppCompatActivity implements Buttonfragment.ChangeColorListener {

    private  ColorFragment colorFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorFragment = (ColorFragment) getFragmentManager().findFragmentById(R.id.frag_color);
    }


    @Override
    public void changeColor(int color) {
        colorFragment.setColor(color);
    }
}
