package com.example.hotpot;

public abstract class Shape {
    public int x;
    public int y;
    
    private String color = "blue";

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
}

