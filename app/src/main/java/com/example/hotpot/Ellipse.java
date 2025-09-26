package com.example.hotpot;

public class Ellipse extends Shape {

    public int rx;
    public int ry;

    public Ellipse(int x, int y, int rx, int ry) {
        this.x = x;
        this.rx = rx;
        this.ry = ry;
    }

    public Ellipse(int x, int y, int rx, int ry, String color) {
        this(x, y, rx, ry);
        this.color = color; 
    }

    public double area() {
        return Math.PI * rx * ry;
    }

    public double perimeterApprox() {
        double a = Math.max(rx, ry);
        double b = Math.min(rx, ry);
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

    public String describe() {
        return "Ellipse @(" + x + "," + y + "), rx=" + rx + ", ry=" + ry + ", color=" + color;
    }
}
