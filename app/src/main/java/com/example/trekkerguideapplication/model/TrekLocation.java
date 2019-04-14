package com.example.trekkerguideapplication.model;

import java.util.ArrayList;

public class TrekLocation {
    private String title, thumbnailUrl;
    private String difficulty;
    private double rating;
    private ArrayList<String> description;

    public TrekLocation() {
    }

    public TrekLocation(String name, String thumbnailUrl, String difficulty, double rating,
                        ArrayList<String> description) {
        this.title = name;
        this.thumbnailUrl = thumbnailUrl;
        this.difficulty = difficulty;
        this.rating = rating;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public ArrayList<String> getDescription() {
        return description;
    }

    public void setDescription(ArrayList<String> description) {
        this.description = description;
    }

}

