package com.example.hdreamalgorithm.khh.weakmeatmeal.v1;

public class Fish {
    private final Integer size;

    public Fish(Integer size) {
        this.size = size;
    }

    public Integer getSize() {
        return this.size;
    }

    public boolean comparisonSize(Integer size) {
        return this.size > size;
    }
}
