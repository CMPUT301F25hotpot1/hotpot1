package com.example.hotpot;

public class Circle extends Shape {
    public int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
    
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{x=" + x + ", y=" + y + ", radius=" + radius + "}";
    }
}
