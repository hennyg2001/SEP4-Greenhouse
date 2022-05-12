package com.example.sep4_greenhouseapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sep4_greenhouseapp.model.Plant;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class PlantListActivity extends AppCompatActivity implements PlantAdapter.OnListItemClicker {

    RecyclerView recyclerView;
    FloatingActionButton myFab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plants_list);
        recyclerView = findViewById(R.id.rv);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.hasFixedSize();

        ArrayList<Plant> plants = new ArrayList<>();

        plants.add(new Plant("Sunflower", "Flower"));
        plants.add(new Plant("Rose", "Flower"));
        plants.add(new Plant("Fern", "Bush"));
        plants.add(new Plant("Tulip", "Flower"));
        plants.add(new Plant("Marijuana", "Cannabis"));
        plants.add(new Plant("Bonsai", "Tree"));
        plants.add(new Plant("Cactus", "Cactaceae"));
        plants.add(new Plant("Ivy", "Wood plant"));
        plants.add(new Plant("Shiitake", "Mushroom"));

        PlantAdapter adapter = new PlantAdapter(plants, this);
        recyclerView.setAdapter(adapter);

        myFab = findViewById(R.id.fab);
        myFab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(PlantListActivity.this, CreatePlantActivity.class));            }
        });
    }

    @Override
    public void onClick(int position) {
        startActivity(new Intent(PlantListActivity.this, PlantActivity.class));
    }

}
