package com.example.sep4_greenhouseapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    ImageButton actuatorButton;
    ImageButton plantProfilesButton;
    ImageButton graphsButton;
    ImageButton checklistButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        actuatorButton = findViewById(R.id.actuatorButton);
        plantProfilesButton = findViewById(R.id.plantProfilesButton);
        graphsButton = findViewById(R.id.measurementsButton);
        checklistButton = findViewById(R.id.checklistButton);

        actuatorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(HomeActivity.this, PlantListActivity.class));
            }
        });
        plantProfilesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(HomeActivity.this, PlantListActivity.class));
            }
        });
        graphsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(HomeActivity.this, PlantListActivity.class));
            }
        });
        checklistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(HomeActivity.this, PlantListActivity.class));
            }
        });
    }

}
