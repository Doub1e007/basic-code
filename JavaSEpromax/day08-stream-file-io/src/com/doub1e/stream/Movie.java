package com.doub1e.stream;

import java.util.Objects;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Movie implements Comparable<Movie> {
    private String name;
    private double score;
    private String actor;

    public Movie() {
    }

    public Movie(String name, double score, String actor) {
        this.name = name;
        this.score = score;
        this.actor = actor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", actor='" + actor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Double.compare(score, movie.score) == 0 && Objects.equals(name, movie.name) && Objects.equals(actor, movie.actor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score, actor);
    }

    @Override
    public int compareTo(Movie o) {
        return Double.compare(this.score, o.score);//升序
    }
}


