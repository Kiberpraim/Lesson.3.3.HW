package com.example.lesson33hw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.lesson33hw.adapter.ContactAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> arrayListName = new ArrayList<>();
    ContactAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addArrayList();

        adapter = new ContactAdapter(arrayListName);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);
    }

    private void addArrayList() {
        arrayListName.add("Abdykulov Almanbet 19");
        arrayListName.add("Kerimbaev Yryskeldi 20");
        arrayListName.add("Abdygulov Chyngyz 21");
        arrayListName.add("Asylbekov Chyngyzbek 22");
        arrayListName.add("Zalilov Radmir 23");
        arrayListName.add("Musaeev Kamaljon 24");
        arrayListName.add("Kerimbaev Iskender 25");
        arrayListName.add("Akpaeva Madina 26");
    }
}