package com.example.hotpot;

public class Star extends Shape {
    private int points;
    private double outerRadius;
    private double innerRadius;

    public Star() {
        this(0, 0, 5, 10.0, 5.0, "yellow");
    }

    public Star(int x, int y, int points, double outerRadius, double innerRadius, String color) {
        this.x = x;
        this.y = y;
        this.points = points;
        this.outerRadius = outerRadius;
        this.innerRadius = innerRadius;
        setColor(color);
    }
    
    public int getPoints() { return points; }
    public void setPoints(int points) { this.points = points; }

    public double getOuterRadius() { return outerRadius; }
    public void setOuterRadius(double outerRadius) { this.outerRadius = outerRadius; }

    public double getInnerRadius() { return innerRadius; }
    public void setInnerRadius(double innerRadius) { this.innerRadius = innerRadius; }

    @Override
    public String toString() {
        return "Star{pos=(" + x + "," + y + "), points=" + points +
                ", outerR=" + outerRadius + ", innerR=" + innerRadius +
                ", color=" + getColor() + "}";
    }
}
