package com.example.hotpot;

public class Diamond extends Shape{
    private int side;

    // inner width and height inside the diamond to determine 4 points' location
    private int inner_width;
    private int inner_height;


    // perfect diamond
    public Diamond(int side) {
        this.side = side;
        inner_height = 5;
        inner_width = 5;
    }

    // regular diamond
    public Diamond(int side, int inner_width, int inner_height) {
        this.side = side;
        this.inner_width = inner_width;
        this.inner_height = inner_height;
    }

    // Getters and Setters
    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getInner_width() {
        return inner_width;
    }

    public void setInner_width(int inner_width) {
        this.inner_width = inner_width;
    }

    public int getInner_height() {
        return inner_height;
    }

    public void setInner_height(int inner_height) {
        this.inner_height = inner_height;
    }
}
