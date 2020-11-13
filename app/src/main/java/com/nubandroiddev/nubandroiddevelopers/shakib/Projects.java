package com.nubandroiddev.nubandroiddevelopers.shakib;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.nubandroiddev.nubandroiddevelopers.R;


public class Projects extends Fragment {
    public Projects() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ListView myProjectsListView = (ListView) container.findViewById(R.id.myProjectsList);

        ArrayAdapter<CharSequence> projectsAdapter = ArrayAdapter.createFromResource(container.getContext(),R.array.sakib_projects, android.R.layout.simple_dropdown_item_1line);
        myProjectsListView.setAdapter(projectsAdapter);

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_projects, container, false);
    }

}