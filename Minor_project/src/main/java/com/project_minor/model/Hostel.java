package com.project_minor.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Hostel {
    private String name;
    private float distance;
    private int price;

    @JsonCreator
    public Hostel(
        @JsonProperty("name") String name,
        @JsonProperty("distance") float distance,
        @JsonProperty("price") int price) {
        this.name = name;
        this.distance = distance;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getDistance() {
        return distance;
    }

    public int getPrice() {
        return price;
    }
}
