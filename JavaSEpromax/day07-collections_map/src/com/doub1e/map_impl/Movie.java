package com.doub1e.map_impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // 包含了无参 + get + set + toString + hashcode + equals
@AllArgsConstructor
@NoArgsConstructor
public class Movie implements Comparable<Movie>{
    private String name;
    private double score;
    private String actor;

    @Override
    public int compareTo(Movie o) {
        return Double.compare(this.score, o.score);
    }
}
