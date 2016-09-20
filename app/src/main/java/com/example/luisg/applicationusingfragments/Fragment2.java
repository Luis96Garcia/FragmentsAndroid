package com.example.luisg.applicationusingfragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by luisg on 17/09/2016.
 */
public class Fragment2 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v;

        v=inflater.inflate(R.layout.fragment2,container);

        return v;

        //return super.onCreateView(inflater, container, savedInstanceState);
    }
}
