package com.example.sep4_greenhouseapp.model;

import java.util.ArrayList;

public class Plant {

    private String id;
    private String name;
    private String type;
    private String description;
    private ArrayList<Log> logs;

    public Plant() {
        // Default constructor required for calls to DataSnapShot.getValue(User.class)
    }

    public Plant(String name, String type, String description) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.logs = logs;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDescription() { return description; }

    public ArrayList<Log> getPlantLogs() {
        return logs;
    }

}
