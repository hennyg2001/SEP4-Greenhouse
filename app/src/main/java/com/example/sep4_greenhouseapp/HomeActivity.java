package com.example.sep4_greenhouseapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sep4_greenhouseapp.authentication.RegistrationActivity;

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
                setContentView(R.layout.plants_list);
            }
        });
        plantProfilesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                setContentView(R.layout.plants_list);
            }
        });
        graphsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                setContentView(R.layout.plants_list);
            }
        });
        checklistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                setContentView(R.layout.plants_list);
            }
        });
    }

}
