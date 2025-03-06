package com.doub1e.collection_travesal;

public class Movie {
    private String name;
    private String actors;
    private double score;

    public Movie() {
    }

    public Movie(String name, String actors, double score) {
        this.name = name;
        this.actors = actors;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", actors='" + actors + '\'' +
                ", score=" + score +
                '}';
    }
}
