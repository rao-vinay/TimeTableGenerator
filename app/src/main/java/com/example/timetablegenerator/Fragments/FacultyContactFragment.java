package com.example.timetablegenerator.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.timetablegenerator.R;


public class FacultyContactFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_faculty_contact, container, false);

        Toast.makeText(getContext(), "Faculty contact Fragment",Toast.LENGTH_SHORT).show();

        return view;
    }
}