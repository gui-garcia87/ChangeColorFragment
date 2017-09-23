package com.example.sifatsp.changecolorfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Sifatsp on 23/09/2017.
 */

public class ColorFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_color, container, false);
    }

    public void setColor(int color){
        getView().setBackgroundColor(color);
    }
}
