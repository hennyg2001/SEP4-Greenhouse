package com.example.sep4_greenhouseapp;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sep4_greenhouseapp.model.Plant;

import java.util.ArrayList;
import java.util.List;

public class PlantListActivity extends AppCompatActivity implements PlantAdapter.OnListItemClicker {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plants_list);
        recyclerView = findViewById(R.id.rv);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.hasFixedSize();

        ArrayList<Plant> plants = new ArrayList<>();

        plants.add(new Plant("Sunflower", "Flower"));
        plants.add(new Plant("Sunflower", "Flower"));
        plants.add(new Plant("Sunflower", "Flower"));
        plants.add(new Plant("Sunflower", "Flower"));

        PlantAdapter adapter = new PlantAdapter(plants, this);
    }

    @Override
    public void onClick(int position) {
        Toast.makeText(this, "Position: ", Toast.LENGTH_SHORT).show();
    }

}
