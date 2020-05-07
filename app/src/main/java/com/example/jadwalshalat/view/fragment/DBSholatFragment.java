package com.example.jadwalshalat.view.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jadwalshalat.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class DBSholatFragment extends Fragment {

    public DBSholatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_d_b_sholat, container, false);
    }
}
