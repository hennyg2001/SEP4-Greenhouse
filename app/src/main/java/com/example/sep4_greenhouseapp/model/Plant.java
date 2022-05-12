package com.example.sep4_greenhouseapp.model;

public class Plant {

    private String name;
    private String type;
    private String description;

    public Plant() {
        // Default constructor required for calls to DataSnapShot.getValue(User.class)
    }

    public Plant(String name, String type, String description) {
        this.name = name;
        this.type = type;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDescription() { return description; }

}
