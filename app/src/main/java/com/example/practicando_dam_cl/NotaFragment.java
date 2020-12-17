package com.example.practicando_dam_cl;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.practicando_dam_cl.dummy.DummyContent;

/**
 * A fragment representing a list of Items.
 */
public class NotaFragment extends Fragment {
    ListView lv;

    SearchView searchView;
    ArrayAdapter<String> adapter;
    String[] data = {"Taller PHP", "Taller Excel", "Taller de Programacion","Taller de Simulacion", "Taller Phyton"};

    public NotaFragment() {
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item, container, false);
        lv = (ListView) view.findViewById(R.id.idListView);
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_expandable_list_item_1, data);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), "Click Item at position:"+ position,Toast.LENGTH_SHORT).show();
            }
        });


        // Set the adapter

        return view;
    }
}